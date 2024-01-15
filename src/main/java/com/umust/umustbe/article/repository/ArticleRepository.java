package com.umust.umustbe.article.repository;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.repository.querydsl.ArticleRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleRepositoryCustom {

    default Article findByIdOrNull(Long id) {
        Optional<Article> optionalArticle = findById(id);
        return optionalArticle.orElse(null);
    }

}