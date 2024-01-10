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

    @Transactional
    public Article save(AddArticleRequest request) {
        return articleRepository.save(request.toEntity());
    }

    /* READ 게시글 리스트 조회 readOnly 속성으로 조회속도 개선 */
    @Transactional(readOnly = true)
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    /* READ 게시글 리스트 조회 readOnly 속성으로 조회속도 개선 */
    @Transactional
    public Article findById(long id) {
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

    @Transactional
    public void delete(long id) {
        articleRepository.deleteById(id);
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = articleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }

}