package com.umust.umustbe.file.dto;

import com.umust.umustbe.article.domain.ArticleFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class FileDetailResponse {

    private Long fildId;
    private String fileURL;

    public static FileDetailResponse from(ArticleFile image) {
        return FileDetailResponse.builder()
                .fildId(image.getId())
                .fileURL(image.getFileUrl())
                .build();
    }
}
