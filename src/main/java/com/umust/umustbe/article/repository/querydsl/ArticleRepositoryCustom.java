package com.umust.umustbe.article.repository.querydsl;

import com.umust.umustbe.article.domain.Article;

import java.util.List;

public interface ArticleRepositoryCustom {
    List<Article> findAllNotDeleted();
}
