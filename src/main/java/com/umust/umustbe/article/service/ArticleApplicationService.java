package com.umust.umustbe.article.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.dto.*;
import com.umust.umustbe.article.exception.ArticleCategoryNotFoundException;
import com.umust.umustbe.article.exception.ArticleNotFoundException;
import com.umust.umustbe.article.repository.ArticleFileRepository;
import com.umust.umustbe.article.repository.ArticleRepository;
import com.umust.umustbe.article.type.ArticleCategory;
import com.umust.umustbe.file.service.FileService;
import com.umust.umustbe.util.S3Handler;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
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
    public Page<ArticleListResponse> findAll(Pageable pageable) {
        Page<Article> articles = articleRepository.findAllNotDeleted(pageable);
        long count = articles.getTotalElements();

        List<ArticleListResponse> articleListResponseList = new ArrayList<>();

        for (Article article : articles) {
            ArticleListResponse meetingResponseDto = ArticleListResponse.from(article);
            articleListResponseList.add(meetingResponseDto);
        }

        return new PageImpl<>(articleListResponseList, pageable, count);
    }

    /* GET) 게시글 리스트 조회 readOnly 속성으로 조회속도 개선 */
    @Transactional(readOnly = true)
    public Page<ArticleDetailResponse> getArticlesByCategoryAndNotDeleted(String category, Pageable pageable) {
        try {
            ArticleCategory articleCategory = ArticleCategory.valueOf(category.toUpperCase());
            Page<Article> articles = articleRepository.findArticlesByCategoryAndNotDeleted(articleCategory, pageable);
            long count = articles.getTotalElements();

            List<ArticleDetailResponse> articleDetailResponseList = new ArrayList<>();

            for (Article article : articles) {
                ArticleDetailResponse meetingResponseDto = ArticleDetailResponse.from(article);
                articleDetailResponseList.add(meetingResponseDto);
            }

            return new PageImpl<>(articleDetailResponseList, pageable, count);
        } catch (IllegalArgumentException e) {
            // 유효하지 않은 카테고리에 대한 예외 처리
            throw new ArticleCategoryNotFoundException();
        }
    }

    /* GET) 카테고리별 최신 게시글 1건 조회 - readOnly 속성으로 조회속도 개선 */
    @Transactional(readOnly = true)
    public ArticleDetailResponse getLatestArticleByCategory(String category) {
        try {
            ArticleCategory articleCategory = ArticleCategory.valueOf(category.toUpperCase());
            Article latestArticle = articleRepository.findLatestArticleByCategoryOrNull(articleCategory);

            if (latestArticle == null) {
                throw new ArticleCategoryNotFoundException();
            }

            return latestArticle.toDetailDTO();
        } catch (IllegalArgumentException e) {
            // 유효하지 않은 카테고리에 대한 예외 처리
            throw new ArticleCategoryNotFoundException();
        }
    }

    /* POST) 게시글 생성 */
    @Transactional
    public ArticleIdResponse saveWithFiles(AddArticleRequest request, List<MultipartFile> multipartFiles) {
        ArticleIdResponse articleId = articleFactory.save(request);
        Article savedArticle = articleRepository.findByIdOrNull(articleId.getId());

        // multipartFiles가 비어있지 않은 경우 s3 업로드
        if (multipartFiles != null && !multipartFiles.isEmpty()) {
            fileService.uploadArticleFiles(multipartFiles, savedArticle);
        }

        return articleId;
    }

    /* PATCH) 게시글 상세 조회 및 조회수 1 증가 */
    @Transactional
    public Article findByIdAndIncreaseViewCount(Long id) {
        Article article = articleRepository.findByIdOrNull(id);

        if (article == null) {
            throw new ArticleNotFoundException(id);
        }

        article.increaseView();

        return article;
    }

    /* PUT) 게시글 수정 */
    @Transactional
    public void updateWithFiles(Long id, UpdateArticleRequest request, List<MultipartFile> multipartFiles) {
        Article article = articleRepository.findByIdOrNull(id);

        if (article == null) {
            throw new ArticleNotFoundException(id);
        }

        article.update(request.getTitle(), request.getContent());

        // multipartFiles가 비어있지 않은 경우 s3 업로드
        if (multipartFiles != null && !multipartFiles.isEmpty()) {
            fileService.uploadArticleFiles(multipartFiles, article);
        }

    }

    /* DELETE) 게시글 삭제 */
    @Transactional
    public void delete(Long id) {
        Article article = articleRepository.findByIdOrNull(id);
        if (article == null) {
            throw new ArticleNotFoundException(id);
        }
        article.delete();
    }

}