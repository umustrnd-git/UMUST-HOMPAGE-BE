package com.umust.umustbe.article.domain;

import com.umust.umustbe.article.type.ArticleCategory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

class ArticleTest {

    @DisplayName("게시글을 생성한다")
    @Test
    void whenCreateArticle_thenArticleIsCreated() {
        // given & when
        ArticleFile file1 = ArticleFile.builder().fileUrl("file1.txt").build();
        ArticleFile file2 = ArticleFile.builder().fileUrl("file2.txt").build();

        Article article = createArticle();

        // then
        assertSoftly(softly -> {
            softly.assertThat(article.getCategory()).isEqualTo(ArticleCategory.NOTICE);
            softly.assertThat(article.getTitle()).isEqualTo("제목");
            softly.assertThat(article.getContent()).isEqualTo("내용");
            softly.assertThat(article.getView()).isEqualTo(1);
            softly.assertThat(article.getFiles()).isNull();
            softly.assertThat(article.getDeletedAt()).isNull();
        });
    }

    @DisplayName("게시글을 수정한다.")
    @Test
    void updateArticle() {
        // given
        Article article = createArticle();

        String updatedTitle = "updatedTitle";
        String updatedContent = "수정된 내용 수정수정";

        // when
        article.update(updatedTitle, updatedContent);

        // then
        assertSoftly(softly -> {
            softly.assertThat(article.getTitle()).isEqualTo(updatedTitle);
            softly.assertThat(article.getContent()).isEqualTo(updatedContent);
        });

    }

    @DisplayName("게시글을 삭제한다")
    @Test
    void givenArticle_whenDeleteArticle_thenSetDeletedAt() {
        // given
        Article article = createArticle();

        // when
        article.delete();

        // then
        assertSoftly(softly -> {
            softly.assertThat(article.getDeletedAt()).isNotNull();
        });
    }

    @DisplayName("게시글을 조회하면 조회수가 1 증가한다")
    @Test
    void givenArticle_whenViewArticle_thenIncreaseViewCountOne() {
        // given
        Article article = createArticle();

        // when
        article.increaseView();

        // then
        assertSoftly(softly -> {
            softly.assertThat(article.getView()).isEqualTo(2);
        });
    }

    private Article createArticle() {
        return Article.builder()
                .category(ArticleCategory.NOTICE.toString())
                .title("제목")
                .content("내용")
                .view(1)
                .build();
    }
}

