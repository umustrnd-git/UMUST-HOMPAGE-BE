package com.umust.umustbe.common.exception;

import com.umust.umustbe.article.exception.ArticleCategoryNotFoundException;
import com.umust.umustbe.article.exception.ArticleContentNullException;
import com.umust.umustbe.article.exception.ArticleNotFoundException;
import com.umust.umustbe.article.exception.ArticleTitleNullOrEmptyException;
import com.umust.umustbe.image.exception.FileUploadFailException;
import com.umust.umustbe.image.exception.UnsupportedImageFileTypeException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@AllArgsConstructor
@Getter
public enum ExceptionType {

    /* Article Exception */
    ARTICLE_NOT_FOUND_EXCEPTION("3001", "게시글이 존재하지 않습니다.", ArticleNotFoundException.class),
    ARTICLE_TITLE_NULL_OR_EMPTY_EXCEPTION("3002", "게시글 제목은 비어있을 수 없습니다.", ArticleTitleNullOrEmptyException.class),
    ARTICLE_CONTENT_NULL_EXCEPTION("3003", "게시글 내용은 null일 수 없습니다.", ArticleContentNullException.class),
    ARTICLE_CATEGORY_NOT_FOUND_EXCEPTION("3004", "존재하지 않는 카테고리입니다.", ArticleCategoryNotFoundException.class),


    FILE_UPLOAD_FAIL_EXCEPTION("7001", "파일 업로드에 실패했습니다.", FileUploadFailException.class),
    UNSUPPORTED_IMAGE_EXTENSION_EXCEPTION("7001", "지원하지 않는 이미지 확장자 입니다.", UnsupportedImageFileTypeException.class),

    /* Etc Exception */
    METHOD_ARGUMENT_NOT_VALID_EXCEPTION("0001", "요청 데이터가 잘못되었습니다."),
    UNHANDLED_EXCEPTION("0000", "알 수 없는 서버 에러가 발생했습니다.");


    private final String errorCode;
    private final String message;

    private Class<? extends ApplicationException> type;

    ExceptionType(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public static ExceptionType from(Class<?> classType) {
        return Arrays.stream(values())
                .filter(it -> Objects.nonNull(it.type) && it.type.equals(classType))
                .findFirst()
                .orElse(UNHANDLED_EXCEPTION);
    }
}
