package com.umust.umustbe.article.controller;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.dto.*;
import com.umust.umustbe.article.service.ArticleApplicationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Tag(name = "Article", description = "Article 관련 API 입니다.")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/articles")
public class ArticleApiController {

    private final ArticleApplicationService articleApplicationService;

    @Operation(summary = "전체 게시글 조회", description = "모든 게시글을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ArticleDetailResponse.class)))),
            @ApiResponse(responseCode = "204", description = "No Content"),
            @ApiResponse(responseCode = "404", description = "No articles found"),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @GetMapping
    public ResponseEntity<List<ArticleListResponse>> findAllArticles() {
        List<ArticleListResponse> articles = articleApplicationService.findAll();

        return ResponseEntity.ok().body(articles);
    }

    @Operation(summary = "카테고리별 게시글 목록 조회", description = "해당 카테고리의 게시글 목록을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ArticleListResponse.class)))),
            @ApiResponse(responseCode = "204", description = "No Content"),
            @ApiResponse(responseCode = "404", description = "No articles found for the specified category"),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @GetMapping("/{category}")
    public ResponseEntity<List<ArticleListResponse>> getArticlesByCategoryAndNotDeleted(
            @PathVariable String category
    ) {
        List<ArticleListResponse> articles = articleApplicationService.getArticlesByCategoryAndNotDeleted(category);
        return ResponseEntity.ok().body(articles);
    }

    @Operation(summary = "해당 카테고리 최근 게시글 한개 조회", description = "해당 카테고리의 가장 최근 게시글 한개를 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ArticleDetailResponse.class)))),
            @ApiResponse(responseCode = "204", description = "No Content"),
            @ApiResponse(responseCode = "404", description = "No articles found for the specified category"),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @GetMapping("/{category}/latest")
    public ResponseEntity<ArticleDetailResponse> getLatestArticleByCategory(
            @PathVariable String category
    ) {
        ArticleDetailResponse latestArticle = articleApplicationService.getLatestArticleByCategory(category);
        return ResponseEntity.ok().body(latestArticle);
    }

    @Operation(summary = "게시글 등록", description = "제목(title)과 내용(content)과 이미지 리스트(List<MultipartFile>) 이용하여 게시물을 신규 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = Article.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @PostMapping
    public ResponseEntity<ArticleIdResponse> addArticle(
            @Valid @RequestPart(value = "article") AddArticleRequest request,
            @RequestPart(value = "file", required = false) List<MultipartFile> multipartFiles) throws IOException {

        // 게시물 등록
        ArticleIdResponse articleIdResponse = articleApplicationService
                .saveWithImage(request, multipartFiles);

        return ResponseEntity.status(200).body(articleIdResponse);
    }

    @Operation(summary = "게시글 상세 조회 및 조회수 1 증가", description = "id로 게시글을 상세 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ArticleDetailResponse.class))),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Article not found")
    })
    @PatchMapping("/{id}")
    // URL 경로에서 값 추출
    public ResponseEntity<ArticleDetailResponse> findArticle(@PathVariable Long id) {
        Article article = articleApplicationService.findByIdAndIncreaseViewCount(id);

        return ResponseEntity.ok()
                .body(ArticleDetailResponse.from(article));
    }

    @Operation(summary = "게시글 수정", description = "id로 게시글을 수정한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = Article.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Article not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @PutMapping("/{id}")
    public ResponseEntity<BaseResponseBody> updateArticle(@PathVariable Long id,
                                                          @Valid @RequestBody UpdateArticleRequest request) {
        articleApplicationService.update(id, request);
        return ResponseEntity.ok(BaseResponseBody.of(200, "게시글 수정 성공"));
    }

    @Operation(summary = "게시글 삭제", description = " id로 게시글을 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "delete OK"),
            @ApiResponse(responseCode = "204", description = "No Content"),
            @ApiResponse(responseCode = "404", description = "Article not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<BaseResponseBody> deleteArticle(@PathVariable Long id) {
        articleApplicationService.delete(id);
        return ResponseEntity.ok(BaseResponseBody.of(200, "게시글 삭제 성공"));
    }

}