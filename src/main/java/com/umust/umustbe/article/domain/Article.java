package com.umust.umustbe.article.domain;

import com.umust.umustbe.article.dto.ArticleDetailResponse;
import com.umust.umustbe.article.type.ArticleCategory;
import com.umust.umustbe.common.BaseEntity;
import com.umust.umustbe.image.domain.ArticleImage;
import com.umust.umustbe.image.dto.ImageResponse;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "article_category", nullable = false)
    @Enumerated(EnumType.STRING)
    private ArticleCategory category;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(columnDefinition = "integer default 1", nullable = false)
    private Integer view;  // 조회수

    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ArticleImage> images;

    @Builder  // 빌더 패턴으로 객체 생성
    public Article(String title, String content, Integer view, String category) {
        this.title = title;
        this.content = content;
        this.view = view;
        this.category = ArticleCategory.valueOf(category);
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void increaseView() {
        this.view += 1;
    }

    public void delete() {
        this.setDeletedAt(LocalDateTime.now());
    }

    public ArticleDetailResponse toDetailDTO() {
        return new ArticleDetailResponse(
                this.id,
                this.title,
                this.content,
                this.getCategory(),
                this.view,
                this.getCreatedAt(),
                this.getCreatedBy(),
                this.getModifiedAt(),
                this.getImages().stream()
                        .map(ImageResponse::from).toList()
        );
    }

}