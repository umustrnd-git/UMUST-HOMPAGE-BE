package com.umust.umustbe.article.dto;

import com.umust.umustbe.article.domain.Article;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(description = "게시물 리스트 응답DTO")
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