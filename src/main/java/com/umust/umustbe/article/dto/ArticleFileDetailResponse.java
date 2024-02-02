package com.umust.umustbe.article.dto;

import com.umust.umustbe.article.domain.ArticleFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class ArticleFileDetailResponse {

    private Long fildId;
    private String fileURL;

    public static ArticleFileDetailResponse from(ArticleFile image) {
        return ArticleFileDetailResponse.builder()
                .fildId(image.getId())
                .fileURL(image.getFileUrl())
                .build();
    }
}
