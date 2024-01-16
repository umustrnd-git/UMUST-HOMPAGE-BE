package com.umust.umustbe.image.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.image.domain.ArticleImage;
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

    public void uploadArticleImages(List<MultipartFile> multipartFileList, Article article) throws IOException {
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
    }
}