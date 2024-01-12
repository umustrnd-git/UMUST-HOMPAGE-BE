package com.umust.umustbe.article.repository;

import com.umust.umustbe.article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    default Article findByIdOrNull(Long id) {
        Optional<Article> optionalArticle = findById(id);
        return optionalArticle.orElse(null);
    }

}