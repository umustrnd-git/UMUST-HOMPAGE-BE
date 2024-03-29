package com.umust.umustbe.article.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.dto.AddArticleRequest;
import com.umust.umustbe.article.dto.UpdateArticleRequest;
import com.umust.umustbe.article.exception.ArticleNotFoundException;
import com.umust.umustbe.article.repository.ArticleFileRepository;
import com.umust.umustbe.article.repository.ArticleRepository;
import com.umust.umustbe.article.type.ArticleCategory;
import com.umust.umustbe.file.service.FileService;
import com.umust.umustbe.util.S3Handler;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleApplicationServiceTest {

    @InjectMocks
    private ArticleApplicationService articleApplicationService;

    @Mock
    private ArticleFactory articleFactory;

    @Mock
    private FileService fileService;

    @Mock
    private S3Handler s3Handler;

    @Mock
    private ArticleRepository articleRepository;

    @Mock
    private ArticleFileRepository articleFileRepository;


    @DisplayName("게시글을 조회하면, 조회수가 1 추가된 게시글을 반환한다.")
    @Test
    void givenArticleId_whenSearchingArticle_thenIncrementsViewCount() {
        // Given
        Long articleId = 1L;
        Article mockArticle = Mockito.mock(Article.class);
//        Article mockArticle = createArticle();
        when(articleRepository.findByIdOrNull(articleId)).thenReturn(mockArticle);

        // When
        articleApplicationService.findByIdAndIncreaseViewCount(articleId);

        // Then
        // articleRepository.findByIdOrNull() 메서드가 올바른 인자로 한 번 호출되었는지 확인
        verify(articleRepository, times(1)).findByIdOrNull(articleId);

        // existingArticle 객체에 대해 increaseView() 메서드가 한 번 호출되었는지 확인
        verify(mockArticle, times(1)).increaseView();
    }

    @DisplayName("게시글을 조회하면, 조회수가 1 추가된 게시글을 반환한다2.")
    @Test
    void givenArticleId_whenSearchingArticle() {
        // Given
        Long articleId = 1L;
        Article mockArticle = Mockito.mock(Article.class);

//        Mockito.when(mockArticle.getId()).thenReturn(articleId);
        Mockito.when(mockArticle.getTitle()).thenReturn("제목");
        Mockito.when(mockArticle.getContent()).thenReturn("내용");

//        Article mockArticle = createArticle();
        when(articleRepository.findByIdOrNull(1L)).thenReturn(mockArticle);

        // When
        Article article = articleApplicationService.findByIdAndIncreaseViewCount(articleId);

        // Then
//        assertThat(article).isEqualTo(1L);
        assertThat(article.getTitle()).isEqualTo("제목");
        assertThat(article.getContent()).isEqualTo("내용");
    }

    @Disabled
    @DisplayName("게시글을 업데이트한다")
    @Test
    public void givenExistingArticle_whenUpdate_thenTitleAndContentUpdated() {
        // Given
        long articleId = 1L;
        UpdateArticleRequest updateRequest = new UpdateArticleRequest("Updated Title", "Updated Content");
        Article existingArticle = createArticle();
        when(articleRepository.findByIdOrNull(articleId)).thenReturn(existingArticle);

        // When
//        articleApplicationService.update(articleId, updateRequest);

        // Then
//        assertSoftly(softly -> {
//            softly.assertThat(existingArticle.getTitle()).isEqualTo("Updated Title");
//            softly.assertThat(existingArticle.getContent()).isEqualTo("Updated Content");
//        });
//        verify(articleRepository, times(1)).findByIdOrNull(articleId);
    }

    @Disabled
    @DisplayName("게시글을 업데이트에 실패한다")
    @Test
    public void givenNonExistentArticle_whenUpdate_thenNotFoundExceptionThrown() {
        // Given
        long nonExistentArticleId = 99L;
        UpdateArticleRequest updateRequest = new UpdateArticleRequest("Updated Title", "Updated Content");
        when(articleRepository.findByIdOrNull(nonExistentArticleId)).thenReturn(null);

        // When and Then
//        assertThrows(ArticleNotFoundException.class,
//                () -> articleApplicationService.update(nonExistentArticleId, updateRequest));
//        verify(articleRepository, times(1)).findByIdOrNull(nonExistentArticleId);
    }

    @DisplayName("게시글을 삭제한다")
    @Test
    public void givenExistingArticle_whenDelete_thenArticleIsDeleted() {
        // Given
        long articleId = 1L;
        Article existingArticle = createArticle();
        when(articleRepository.findByIdOrNull(articleId)).thenReturn(existingArticle);

        // When
        articleApplicationService.delete(articleId);

        // Then
        assertThat(existingArticle.getDeletedAt()).isNotNull();
        verify(articleRepository, times(1)).findByIdOrNull(articleId);
    }

    @DisplayName("게시글을 삭제에 실패한다")
    @Test
    public void givenNonExistentArticle_whenDelete_thenNotFoundExceptionThrown() {
        // Given
        long nonExistentArticleId = 99L;
        when(articleRepository.findByIdOrNull(nonExistentArticleId)).thenReturn(null);

        // When and Then
        assertThrows(ArticleNotFoundException.class,
                () -> articleApplicationService.delete(nonExistentArticleId));
        verify(articleRepository, times(1)).findByIdOrNull(nonExistentArticleId);
    }


    private Article createArticle() {
        return Article.builder()
                .category(ArticleCategory.NOTICE.toString())
                .title("제목")
                .content("내용")
                .view(1)
                .build();
    }

    private AddArticleRequest createAddArticleRequest() {
        return AddArticleRequest.builder()
                .title("제목")
                .content("내용")
                .category(ArticleCategory.NOTICE.toString())
                .build();
    }
}