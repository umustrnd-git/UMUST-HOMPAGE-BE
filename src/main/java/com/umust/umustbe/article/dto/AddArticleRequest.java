package com.umust.umustbe.article.dto;

import com.umust.umustbe.article.domain.Article;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    @Schema(description = "제목", nullable = false)
    private String title;
    @Schema(description = "내용", nullable = false)
    private String content;

    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }

}