package com.umust.umustbe.article.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.image.domain.ArticleImage;
import com.umust.umustbe.article.dto.*;
import com.umust.umustbe.image.repository.ImageRepository;
import com.umust.umustbe.article.repository.ArticleRepository;
import com.umust.umustbe.image.service.ImageService;
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
    private final ImageService imageService;
    private final S3Handler s3Handler;
    private final ArticleRepository articleRepository;
    private final ImageRepository articleImageRepository;

    /* GET) 게시글 리스트 조회 readOnly 속성으로 조회속도 개선 */
    @Transactional(readOnly = true)
    public List<ArticleResponse> findAll() {
        List<Article> articles = articleRepository.findAllNotDeleted();

        return articles.stream()
                .map(Article::toDTO).toList();
    }

    /* POST) 게시글 생성 */
    @Transactional
    public ArticleIdResponse save(AddArticleRequest request) {
        return articleFactory.save(request);
    }

    @Transactional
    public void saveWithImage(AddArticleRequest request, List<MultipartFile> multipartFileList) throws IOException {
        ArticleIdResponse articleId = articleFactory.save(request);
        Article savedArticle = articleRepository.findByIdOrNull(articleId.getId());

        // 이미지 업로드
        imageService.uploadArticleImages(multipartFileList, savedArticle);

    }

    /* PUT) 게시글 상세 조회 및 조회수 1 증가 */
    @Transactional
    public Article findByIdAndIncreaseViewCount(long id) {
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
            throw new NotFoundException("Article with id " + id + " not found");
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