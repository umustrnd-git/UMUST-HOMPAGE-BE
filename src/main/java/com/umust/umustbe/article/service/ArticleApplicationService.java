package com.umust.umustbe.article.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.dto.*;
import com.umust.umustbe.article.exception.ArticleCategoryNotFoundException;
import com.umust.umustbe.article.repository.ArticleFileRepository;
import com.umust.umustbe.article.repository.ArticleRepository;
import com.umust.umustbe.article.type.ArticleCategory;
import com.umust.umustbe.file.service.FileService;
import com.umust.umustbe.util.S3Handler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.webjars.NotFoundException;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleApplicationService {

    private final ArticleFactory articleFactory;
    private final FileService fileService;
    private final S3Handler s3Handler;
    private final ArticleRepository articleRepository;
    private final ArticleFileRepository articleFileRepository;

    /* GET) 게시글 리스트 조회 readOnly 속성으로 조회속도 개선 */
    @Transactional(readOnly = true)
    public List<ArticleListResponse> findAll() {
        List<Article> articles = articleRepository.findAllNotDeleted();

        return articles.stream()
                .map(ArticleListResponse::from).toList();
    }

    /* GET) 게시글 리스트 조회 readOnly 속성으로 조회속도 개선 */
    @Transactional(readOnly = true)
    public List<ArticleListResponse> getArticlesByCategoryAndNotDeleted(String category) {
        try {
            ArticleCategory articleCategory = ArticleCategory.valueOf(category.toUpperCase());
            List<Article> articles = articleRepository.findArticlesByCategoryAndNotDeleted(articleCategory);
            return articles.stream()
                    .map(ArticleListResponse::from).toList();
        } catch (IllegalArgumentException e) {
            // 유효하지 않은 카테고리에 대한 예외 처리
            throw new ArticleCategoryNotFoundException();
        }
    }

    /* GET) 게시글 리스트 조회 readOnly 속성으로 조회속도 개선 */
    @Transactional(readOnly = true)
    public ArticleDetailResponse getLatestArticleByCategory(String category) {
        try {
            ArticleCategory articleCategory = ArticleCategory.valueOf(category.toUpperCase());
            Article latestArticle = articleRepository.findLatestArticleByCategoryOrNull(articleCategory);

            if (latestArticle == null) {
                throw new NotFoundException("No articles found for category: " + category);
            }

            return latestArticle.toDetailDTO();
        } catch (IllegalArgumentException e) {
            // 유효하지 않은 카테고리에 대한 예외 처리
            throw new ArticleCategoryNotFoundException();
        }
    }

    /* POST) 게시글 생성 */
    @Transactional
    @Deprecated
    public ArticleIdResponse save(AddArticleRequest request) {
        return articleFactory.save(request);
    }

    @Transactional
    public ArticleIdResponse saveWithFiles(AddArticleRequest request, List<MultipartFile> multipartFiles) throws IOException {
        ArticleIdResponse articleId = articleFactory.save(request);
        Article savedArticle = articleRepository.findByIdOrNull(articleId.getId());

        // multipartFiles가 비어있지 않은 경우 s3 업로드
        if (!multipartFiles.isEmpty()) {
            fileService.uploadArticleFiles(multipartFiles, savedArticle);
        }

        return articleId;
    }

    /* PATCH) 게시글 상세 조회 및 조회수 1 증가 */
    @Transactional
    public Article findByIdAndIncreaseViewCount(Long id) {
        Article article = articleRepository.findByIdOrNull(id);

        if (article == null) {
            throw new NotFoundException("Article with id " + id + " not found");
        }

        article.increaseView();

        return article;
    }

    /* PUT) 게시글 수정 */
    @Transactional
    public void update(long id, UpdateArticleRequest request) {
        Article article = articleRepository.findByIdOrNull(id);

        if (article == null) {
            throw new com.umust.umustbe.common.exception.NotFoundException("Article with id " + id + " not found");
        }

        article.update(request.getTitle(), request.getContent());
    }

    /* DELETE) 게시글 삭제 */
    @Transactional
    public void delete(long id) {
        Article article = articleRepository.findByIdOrNull(id);
        article.delete();
    }

}