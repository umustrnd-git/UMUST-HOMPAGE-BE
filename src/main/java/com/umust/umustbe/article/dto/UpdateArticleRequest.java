package com.umust.umustbe.article.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateArticleRequest {

    @Schema(description = "제목")
    @NotBlank(message = "제목을 입력해주세요.")
    private String title;

    @Schema(description = "내용")
    @NotBlank(message = "내용을 입력해주세요.")
    private String content;

}