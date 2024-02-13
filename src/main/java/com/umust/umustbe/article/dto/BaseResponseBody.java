package com.umust.umustbe.article.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 서버 요청에대한 기본 응답값(바디) 정의.
 */
@Getter
@Setter
@Schema(description = "서버 요청에대한 기본 응답값(바디) 정의")
public class BaseResponseBody {
    @Schema(description = "응답 메시지", example = "정상")
    String message = null;
    @Schema(description = "응답 코드", example = "200")
    Integer statusCode = null;

    public BaseResponseBody() {
    }

    public BaseResponseBody(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public BaseResponseBody(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public static BaseResponseBody of(Integer statusCode, String message) {
        BaseResponseBody body = new BaseResponseBody();
        body.message = message;
        body.statusCode = statusCode;
        return body;
    }
}
