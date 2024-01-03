package com.umust.umustbe.article.dto;

import com.umust.umustbe.article.domain.Article;

import java.time.LocalDateTime;

public record ArticleResponse (Long id,
                               String title,
                               String content,
                               LocalDateTime createdAt,
                               String createdBy, String modifiedBy,
                               LocalDateTime modifiedAt){
    public static ArticleResponse from(Article article) {
        return new ArticleResponse(
                article.getId(),
                article.getTitle(),
                article.getContent(),
                article.getCreatedAt(),
                article.getCreatedBy(),
                article.getModifiedBy(),
                article.getModifiedAt()
        );
    }

}
