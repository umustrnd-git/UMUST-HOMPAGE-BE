package com.umust.umustbe.article.repository.querydsl;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.domain.QArticle;
import com.umust.umustbe.article.type.ArticleCategory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class ArticleRepositoryCustomImpl extends QuerydslRepositorySupport implements
ArticleRepositoryCustom {

    public ArticleRepositoryCustomImpl() {
        super(Article.class);
    }

    @Override
    public List<Article> findAllNotDeleted() {
        QArticle article = QArticle.article;

        List<Article> articleList = from(article)
                .where(article.deletedAt.isNull())
                .fetch();

        return articleList;
    }

    @Override
    public List<Article> findArticlesByCategoryAndNotDeleted(ArticleCategory category) {
        QArticle article = QArticle.article;

        return from(article)
                .where(article.category.eq(category)
                        .and(article.deletedAt.isNull()))
                .fetch();
    }

    public Article findLatestArticleByCategoryOrNull(ArticleCategory category) {
        QArticle article = QArticle.article;

        return from(article)
                .where(article.category.eq(category)
                        .and(article.deletedAt.isNull()))
                .orderBy(article.createdAt.desc())
                .limit(1)
                .fetchOne();
    }

}