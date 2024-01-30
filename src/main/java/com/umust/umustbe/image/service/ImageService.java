package com.umust.umustbe.image.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.image.domain.ArticleImage;
import com.umust.umustbe.image.dto.ImageUrlResponse;
import com.umust.umustbe.image.exception.FileUploadFailException;
import com.umust.umustbe.image.repository.ImageRepository;
import com.umust.umustbe.util.S3Handler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ImageService {

    private final ImageRepository imageRepository;
    private final S3Handler s3Handler;

    public void uploadArticleImages(List<MultipartFile> multipartFileList, Article article) {
        try {
            if (multipartFileList != null) {
                for (MultipartFile file : multipartFileList) {
                    String imgUrl = s3Handler.upload(file);
                    ArticleImage img = ArticleImage.builder()
                            .article(article)
                            .imgUrl(imgUrl)
                            .build();

                    imageRepository.save(img);
                }
            }
        } catch (IOException e) {
            throw new FileUploadFailException();
        }

    }

    public ImageUrlResponse uploadImage(MultipartFile multipartFile) {
        try {
            String uploadUrl = s3Handler.upload(multipartFile);

            return ImageUrlResponse.builder()
                    .imageUrl(uploadUrl)
                    .build();
        } catch (IOException e) {
            throw new FileUploadFailException();
        }
    }
}