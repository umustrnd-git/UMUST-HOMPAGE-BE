package com.umust.umustbe.article.service;

import com.umust.umustbe.article.repository.ArticleFileRepository;
import com.umust.umustbe.file.service.FileService;
import com.umust.umustbe.util.S3Handler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ArticleFIleService {

    private final FileService fileService;
    private final S3Handler s3Handler;
    private final ArticleFileRepository articleFileRepository;

    @Transactional
    public void deleteArticleFile(Long id) {
        articleFileRepository.deleteById(id);
    }
}
