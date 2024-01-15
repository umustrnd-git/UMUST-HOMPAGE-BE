package com.umust.umustbe.article.repository;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.domain.ArticleImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleImageRepository extends JpaRepository<ArticleImage, Long> {
    void deleteByArticle(Article article);

    List<ArticleImage> findByArticle(Article article);
}