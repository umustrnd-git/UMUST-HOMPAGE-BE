package com.umust.umustbe.article.repository.querydsl;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.type.ArticleCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ArticleRepositoryCustom {
    Page<Article> findAllNotDeleted(Pageable pageable);
    Page<Article> findArticlesByCategoryAndNotDeleted(ArticleCategory category, Pageable pageable);
    Article findLatestArticleByCategoryOrNull(ArticleCategory category);
}