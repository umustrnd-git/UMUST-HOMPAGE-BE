package com.umust.umustbe.article.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.dto.AddArticleRequest;
import com.umust.umustbe.article.dto.ArticleIdResponse;
import com.umust.umustbe.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ArticleFactory {

    private final ArticleRepository articleRepository;

    @Transactional
    public ArticleIdResponse save(AddArticleRequest request) {

        Article article = Article.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .view(1)
                .build();

        articleRepository.save(article);

        return new ArticleIdResponse(article);
    }

}
