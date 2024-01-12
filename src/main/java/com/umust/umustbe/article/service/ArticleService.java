package com.umust.umustbe.article.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.dto.AddArticleRequest;
import com.umust.umustbe.article.dto.UpdateArticleRequest;
import com.umust.umustbe.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    /* GET) 게시글 리스트 조회 readOnly 속성으로 조회속도 개선 */
    @Transactional(readOnly = true)
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    /* POST) 게시글 생성 */
    @Transactional
    public Article save(AddArticleRequest request) {
        return articleRepository.save(request.toEntity());
    }

    /* PUT) 게시글 상세 조회 및 조회수 1 증가 */
    @Transactional
    public Article findByIdAndIncreaseViewCount(long id) {
        Optional<Article> article = articleRepository.findById(id);
        if (article.isPresent()) {
            Article viewedArticle = article.get();
            viewedArticle.setView(viewedArticle.getView() + 1);
            articleRepository.save(viewedArticle);
            return viewedArticle;
        } else {
            throw new IllegalArgumentException("not found: " + id);
        }
    }

    /* PUT) 게시글 수정 */
    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = articleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }

    /* DELETE) 게시글 삭제 */
    @Transactional
    public void delete(long id) {
        articleRepository.deleteById(id);
    }

}