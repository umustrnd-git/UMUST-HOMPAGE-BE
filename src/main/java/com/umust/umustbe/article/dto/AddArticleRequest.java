package com.umust.umustbe.article.dto;

import com.umust.umustbe.article.domain.Article;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    @Schema(description = "제목", nullable = false)
    @NotBlank(message = "제목을 입력해주세요.")
    private String title;
    @Schema(description = "내용", nullable = false)
    @NotBlank(message = "내용을 입력해주세요.")
    private String content;

    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content)
                .view(1)
                .build();
    }

}