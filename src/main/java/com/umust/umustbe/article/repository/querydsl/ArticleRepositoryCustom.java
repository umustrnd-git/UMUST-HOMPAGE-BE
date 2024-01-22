package com.umust.umustbe.article.repository.querydsl;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.type.ArticleCategory;

import java.util.List;

public interface ArticleRepositoryCustom {
    List<Article> findAllNotDeleted();
    List<Article> findArticlesByCategoryAndNotDeleted(ArticleCategory category);
}