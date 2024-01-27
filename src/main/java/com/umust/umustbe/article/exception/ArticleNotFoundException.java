package com.umust.umustbe.article.exception;

import com.umust.umustbe.common.exception.NotFoundException;

public class ArticleNotFoundException extends NotFoundException {
    public ArticleNotFoundException(long articleId) {
        super(String.format("(articleId : %d)", articleId));
    }
}
