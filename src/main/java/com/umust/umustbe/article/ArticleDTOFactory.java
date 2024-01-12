package com.umust.umustbe.article;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.dto.AddArticleRequest;
import com.umust.umustbe.article.dto.ArticleResponse;

import java.util.List;

public class ArticleDTOFactory {

    private ArticleDTOFactory() {
    }

    public static List<ArticleResponse>  toArticleResponseFrom(List<Article> articles) {
        return articles.stream()
                .map(ArticleResponse::from)
                .toList();
    }

    public static Article toArticleFromAddRequest(AddArticleRequest addArticleRequest) {
        return Article.builder()
                .title(addArticleRequest.getTitle())
                .content(addArticleRequest.getContent())
                .view(1)
                .build();
    }

}
