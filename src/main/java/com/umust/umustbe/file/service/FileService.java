package com.umust.umustbe.file.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.file.domain.ArticleImage;
import com.umust.umustbe.file.dto.FileUrlResponse;
import com.umust.umustbe.file.repository.ImageRepository;
import com.umust.umustbe.util.S3Handler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FileService {

    private final ImageRepository imageRepository;
    private final S3Handler s3Handler;

    @Deprecated
    public void uploadArticleImages(List<MultipartFile> multipartFileList, Article article) {
        if (multipartFileList != null) {
            for (MultipartFile file : multipartFileList) {
                String imgUrl = s3Handler.uploadFile(file);
                ArticleImage img = ArticleImage.builder()
                        .article(article)
                        .imgUrl(imgUrl)
                        .build();

                imageRepository.save(img);
            }
        }
    }

    public FileUrlResponse uploadFile(MultipartFile multipartFile) {
        String uploadUrl = s3Handler.uploadFile(multipartFile);

        return FileUrlResponse.builder()
                .fileURL(uploadUrl)
                .build();
    }
}