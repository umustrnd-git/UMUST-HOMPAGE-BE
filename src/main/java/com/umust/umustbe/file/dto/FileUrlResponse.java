package com.umust.umustbe.file.dto;

import com.umust.umustbe.file.domain.ArticleImage;
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

    public static FileUrlResponse from(ArticleImage image) {
        return new FileUrlResponse(image.getImgUrl());
    }

}
