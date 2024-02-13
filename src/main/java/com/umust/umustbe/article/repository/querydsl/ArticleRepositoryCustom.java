package com.umust.umustbe.article.repository.querydsl;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.type.ArticleCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArticleRepositoryCustom {
    Page<Article> findAllNotDeleted(Pageable pageable);

    Page<Article> findArticlesByCategoryAndNotDeleted(ArticleCategory category, Pageable pageable);

    Article findLatestArticleByCategoryOrNull(ArticleCategory category);
}