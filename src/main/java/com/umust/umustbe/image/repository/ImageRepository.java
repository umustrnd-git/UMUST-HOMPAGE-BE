package com.umust.umustbe.image.repository;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.image.domain.ArticleImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<ArticleImage, Long> {
    void deleteByArticle(Article article);

    List<ArticleImage> findByArticle(Article article);
}