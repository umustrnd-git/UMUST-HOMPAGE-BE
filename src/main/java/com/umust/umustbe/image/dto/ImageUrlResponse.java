package com.umust.umustbe.image.dto;

import com.umust.umustbe.image.domain.ArticleImage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class ImageUrlResponse {

    private String imageUrl;

    public static ImageUrlResponse from(ArticleImage image) {
        return new ImageUrlResponse(image.getImgUrl());
    }

}
