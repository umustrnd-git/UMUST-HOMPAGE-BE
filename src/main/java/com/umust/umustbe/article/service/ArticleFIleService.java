package com.umust.umustbe.article.service;

import com.umust.umustbe.article.domain.ArticleFile;
import com.umust.umustbe.article.repository.ArticleFileRepository;
import com.umust.umustbe.file.service.FileService;
import com.umust.umustbe.util.S3Handler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArticleFIleService {

    private final FileService fileService;
    private final S3Handler s3Handler;
    private final ArticleFileRepository articleFileRepository;

    @Transactional
    public void deleteArticleFile(Long id) {
        Optional<ArticleFile> articleFile = articleFileRepository.findById(id);
        s3Handler.deleteFile(articleFile.get().getFileUrl());
        articleFileRepository.deleteById(id);
    }
}