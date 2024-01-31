package com.umust.umustbe.image.exception;

import com.umust.umustbe.common.exception.BadRequestException;

public class UnsupportedImageFileTypeException extends BadRequestException {

    public UnsupportedImageFileTypeException() {
    }

    public UnsupportedImageFileTypeException(final String extension) {
        super(String.format(": 지원하는 이미지 확장자가 아닙니다. [%s]", extension));
    }

}