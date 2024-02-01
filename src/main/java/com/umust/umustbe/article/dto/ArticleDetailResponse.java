package com.umust.umustbe.article.dto;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.type.ArticleCategory;
import com.umust.umustbe.file.dto.FileUrlResponse;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.List;

@Schema(description = "게시물 상세 정보 응답DTO")
public record ArticleDetailResponse(Long id,
                                    String title,
                                    String content,
                                    ArticleCategory category,
                                    Integer view,
                                    LocalDateTime createdAt,
                                    String createdBy,
                                    LocalDateTime modifiedAt,
                                    List<FileUrlResponse> images){

    public static ArticleDetailResponse from(Article article) {
        List<FileUrlResponse> imagesResponse = article.getFiles().stream()
                .map(FileUrlResponse::from)
                .toList();

        return new ArticleDetailResponse(
                article.getId(),
                article.getTitle(),
                article.getContent(),
                article.getCategory(),
                article.getView(),
                article.getCreatedAt(),
                article.getCreatedBy(),
                article.getModifiedAt(),
                imagesResponse
        );
    }

}