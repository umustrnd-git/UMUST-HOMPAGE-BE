package com.umust.umustbe.article.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class ArticleSaveReq {
    @Schema(description = "제목", nullable = false)
    @NotBlank(message = "제목을 입력해주세요.")
    private String title;

    @Schema(description = "내용", nullable = false)
    @NotBlank(message = "내용을 입력해주세요.")
    private String content;

    @Schema(description = "이미지")
    private List<MultipartFile> images;

}
