package com.umust.umustbe.article.repository.querydsl;

import com.querydsl.core.QueryResults;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.type.ArticleCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.umust.umustbe.article.domain.QArticle.article;

public class ArticleRepositoryCustomImpl extends QuerydslRepositorySupport implements
        ArticleRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    public ArticleRepositoryCustomImpl(JPAQueryFactory queryFactory) {
        super(Article.class);
        this.queryFactory = queryFactory;
    }

    @Override
    public Page<Article> findAllNotDeleted(Pageable pageable) {

        List<Article> articleList = from(article)
                .where(article.deletedAt.isNull())
                .offset(pageable.getOffset())   // 페이지 번호
                .limit(pageable.getPageSize())  // 페이지 사이즈
                .fetch();

        Long count = queryFactory.select(article.count())
                .from(article)
                .where(article.deletedAt.isNull())
                .fetchOne();

        return new PageImpl<>(articleList, pageable, count != null ? count : 0L);
    }

    @Override
    public Page<Article> findArticlesByCategoryAndNotDeleted(ArticleCategory category, Pageable pageable) {

        List<Article> articleList = from(article)
                .where(article.category.eq(category)
                        .and(article.deletedAt.isNull()))
                .offset(pageable.getOffset())   // 페이지 번호
                .limit(pageable.getPageSize())  // 페이지 사이즈
                .fetch();

        Long count = queryFactory.select(article.count())
                .from(article)
                .where(article.category.eq(category)
                        .and(article.deletedAt.isNull()))
                .fetchOne();

        return new PageImpl<>(articleList, pageable, count != null ? count : 0L);
    }

    public Article findLatestArticleByCategoryOrNull(ArticleCategory category) {

        return from(article)
                .where(article.category.eq(category)
                        .and(article.deletedAt.isNull()))
                .orderBy(article.createdAt.desc())
                .limit(1)
                .fetchOne();
    }

}