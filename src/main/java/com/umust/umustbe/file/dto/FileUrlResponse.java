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
public class FileUrlResponse {

    private String fileURL;

    public static FileUrlResponse from(ArticleFile image) {
        return FileUrlResponse.builder()
                .fileURL(image.getFileUrl())
                .build();
    }

}
