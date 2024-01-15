package com.umust.umustbe.article.repository.querydsl;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.domain.QArticle;
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

}
