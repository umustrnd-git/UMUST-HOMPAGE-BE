package com.umust.umustbe.article.controller;

import com.umust.umustbe.article.dto.BaseResponseBody;
import com.umust.umustbe.article.service.ArticleFIleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "ArticleFiles", description = "ArticleFiles 관련 API 입니다.")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/articleFiles")
public class ArticleFileController {

    private final ArticleFIleService articleFIleService;

    @Operation(summary = "게시글의 파일 삭제", description = " {id} 게시글의 {id}파일을 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "delete OK"),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<BaseResponseBody> deleteArticleFile(@PathVariable Long id) {
        articleFIleService.deleteArticleFile(id);
        return ResponseEntity.ok(BaseResponseBody.of(200, "파일 삭제 성공" + id));
    }
}

