package com.umust.umustbe.article.dto;

import com.umust.umustbe.article.domain.Article;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ArticleIdResponse {
    private Long id;

    public ArticleIdResponse(Article article) {
        this.id = article.getId();
    }
}
