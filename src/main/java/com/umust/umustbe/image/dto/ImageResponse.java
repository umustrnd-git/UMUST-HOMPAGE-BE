package com.umust.umustbe.image.dto;

import com.umust.umustbe.image.domain.ArticleImage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ImageResponse {

    private String imageUrl;

    public static ImageResponse from(ArticleImage image) {
        return new ImageResponse(image.getImgUrl());
    }

}
