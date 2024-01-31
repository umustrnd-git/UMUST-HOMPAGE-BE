package com.umust.umustbe.image.controller;

import com.umust.umustbe.article.dto.ArticleDetailResponse;
import com.umust.umustbe.image.dto.FileUrlResponse;
import com.umust.umustbe.image.service.ImageService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Tag(name = "Article", description = "Image 관련 API 입니다.")
@RequiredArgsConstructor
@RequestMapping("/api/images")
@RestController
public class ImageController {

    private final ImageService imageService;

    @Operation(summary = "이미지 1개 업로드", description = "1개의 이미지를 s3에 업로드하고 imgURL을 반환받는다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ArticleDetailResponse.class)))),
            @ApiResponse(responseCode = "7001", description = "파일 업로드에 실패했습니다."),
            @ApiResponse(responseCode = "7002", description = "지원하지 않는 이미지 확장자 입니다."),
            @ApiResponse(responseCode = "0000", description = "알 수 없는 서버 에러",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @PostMapping
    public ResponseEntity<FileUrlResponse> uploadImages(
            @RequestPart(value = "file", required = true) MultipartFile uploadImageFile) {
        return ResponseEntity.ok(imageService.uploadImage(uploadImageFile));

    }
}