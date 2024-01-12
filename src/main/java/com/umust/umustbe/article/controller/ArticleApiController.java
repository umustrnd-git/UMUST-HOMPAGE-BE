package com.umust.umustbe.article.controller;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.dto.AddArticleRequest;
import com.umust.umustbe.article.dto.ArticleResponse;
import com.umust.umustbe.article.dto.UpdateArticleRequest;
import com.umust.umustbe.article.service.ArticleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Article", description = "Article 관련 API 입니다.")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ArticleApiController {

    private final ArticleService articleService;

    @Operation(summary = "전체 게시글 조회", description = "모든 게시글을 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ArticleResponse.class)))),
            @ApiResponse(responseCode = "204", description = "No Content"),
            @ApiResponse(responseCode = "404", description = "No articles found"),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @GetMapping("/articles")
    public ResponseEntity<List<ArticleResponse>> findAllArticles() {
        List<ArticleResponse> articles = articleService.findAll();

        return ResponseEntity.ok().body(articles);
    }

    @Operation(summary = "게시글 등록", description = "제목(title)과 내용(content)을 이용하여 게시물을 신규 등록한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = Article.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @PostMapping("/articles")
    public ResponseEntity<Article> addArticle(@Valid @RequestBody AddArticleRequest request) {
        Article savedArticle = articleService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }

    @Operation(summary = "게시글 상세 조회 및 조회수 1 증가", description = "id로 게시글을 상세 조회한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ArticleResponse.class))),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Article not found")
    })
    @PostMapping("/articles/{id}")
    // URL 경로에서 값 추출
    public ResponseEntity<ArticleResponse> findArticle(@PathVariable long id) {
        Article article = articleService.findByIdAndIncreaseViewCount(id);

        return ResponseEntity.ok()
                .body(ArticleResponse.from(article));
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
    @PutMapping("/articles/{id}")
    public ResponseEntity<Article> updateArticle(@PathVariable long id,
                                                 @Valid @RequestBody UpdateArticleRequest request) {
        Article updatedArticle = articleService.update(id, request);

        return ResponseEntity.ok()
                .body(updatedArticle);
    }
    @Operation(summary = "게시글 삭제", description = " id로 게시글을 삭제한다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "No Content"),
            @ApiResponse(responseCode = "404", description = "Article not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))})
    })
    @DeleteMapping("/articles/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable long id) {
        articleService.delete(id);

        return ResponseEntity.ok()
                .build();
    }

}