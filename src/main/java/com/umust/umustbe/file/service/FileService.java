package com.umust.umustbe.file.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.domain.ArticleFile;
import com.umust.umustbe.article.repository.ArticleFileRepository;
import com.umust.umustbe.file.dto.FileUrlResponse;
import com.umust.umustbe.util.S3Handler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FileService {

    private final ArticleFileRepository articleFileRepository;
    private final S3Handler s3Handler;

    public void uploadArticleFiles(List<MultipartFile> multipartFileList, Article article) {
        if (multipartFileList != null) {
            for (MultipartFile file : multipartFileList) {
                String imgUrl = s3Handler.uploadFile(file);
                ArticleFile articleFile = ArticleFile.builder()
                        .article(article)
                        .originalFileName(file.getOriginalFilename())
                        .fileUrl(imgUrl)
                        .build();

                articleFileRepository.save(articleFile);
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