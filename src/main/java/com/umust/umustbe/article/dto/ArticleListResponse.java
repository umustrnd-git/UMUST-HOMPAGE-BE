package com.umust.umustbe.article.dto;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.type.ArticleCategory;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(description = "게시물 리스트 응답DTO")
public record ArticleListResponse(Long id,
                                  String title,
                                  String content,
                                  ArticleCategory category,
                                  Integer view,
                                  LocalDateTime createdAt,
                                  String createdBy,
                                  LocalDateTime modifiedAt
) {
    public static ArticleListResponse from(Article article) {

        return new ArticleListResponse(
                article.getId(),
                article.getTitle(),
                article.getContent(),
                article.getCategory(),
                article.getView(),
                article.getCreatedAt(),
                article.getCreatedBy(),
                article.getModifiedAt()
        );
    }
}
