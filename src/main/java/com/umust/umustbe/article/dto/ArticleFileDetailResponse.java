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
    private String originalFileName;
    private String fileURL;

    public static ArticleFileDetailResponse from(ArticleFile file) {
        return ArticleFileDetailResponse.builder()
                .fildId(file.getId())
                .originalFileName(file.getOriginalFileName())
                .fileURL(file.getFileUrl())
                .build();
    }
}
