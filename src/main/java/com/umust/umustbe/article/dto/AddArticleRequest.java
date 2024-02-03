package com.umust.umustbe.article.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class AddArticleRequest {

    @Schema(description = "제목", nullable = false)
    @NotBlank(message = "제목을 입력해주세요.")
    private String title;
    @Schema(description = "내용", nullable = false)
    @NotBlank(message = "내용을 입력해주세요.")
    private String content;

    @Schema(description = "카테고리", nullable = false)
    @NotBlank(message = "카테고리 분류 (NOTICE, NEWS, EVENT")
    private String category;

}