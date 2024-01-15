package com.umust.umustbe.article.service;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.article.dto.AddArticleRequest;
import com.umust.umustbe.article.dto.ArticleIdResponse;
import com.umust.umustbe.article.dto.ArticleResponse;
import com.umust.umustbe.article.repository.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ArticleApplicationServiceTest {

    @Mock
    private ArticleRepository articleRepository;

    @InjectMocks
    private ArticleApplicationService articleApplicationService;

    @Test
    void findAll() {
        // Given
        List<Article> mockArticles = Arrays.asList(
                new Article("Title1", "Content1", 10),
                new Article("Title2", "Content2", 15)
        );

        when(articleRepository.findAll()).thenReturn(mockArticles);

        // When
        List<ArticleResponse> articleResponses = articleApplicationService.findAll();

        // Then
        verify(articleRepository, times(1)).findAll();
        assertEquals(mockArticles.size(), articleResponses.size());

        assertEquals(mockArticles.get(0).getId(), articleResponses.get(0).id());
        assertEquals(mockArticles.get(1).getTitle(), articleResponses.get(1).title());
    }

    @Test
    void save() {
        // Given
        AddArticleRequest request = new AddArticleRequest("제목", "내용");
        Article article = ArticleDTOFactory.toArticleFromAddRequest(request);

        when(articleRepository.save(any(Article.class))).thenReturn(article);

        // When
        ArticleIdResponse response = articleApplicationService.save(request);

        // Then
        verify(articleRepository, times(1)).save(any(Article.class));
    }

    @Test
    void findByIdAndIncreaseViewCount() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}