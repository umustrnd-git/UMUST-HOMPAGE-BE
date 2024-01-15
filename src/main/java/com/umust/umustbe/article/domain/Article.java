package com.umust.umustbe.article.domain;

import com.umust.umustbe.article.dto.ArticleResponse;
import com.umust.umustbe.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(columnDefinition = "integer default 1", nullable = false)
    private Integer view;  // 조회수

    @Builder  // 빌더 패턴으로 객체 생성
    public Article(String title, String content, Integer view) {
        this.title = title;
        this.content = content;
        this.view = view;
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

    public ArticleResponse toDTO() {
        return new ArticleResponse(
                this.id,
                this.title,
                this.content,
                this.view,
                this.getCreatedAt(),
                this.getCreatedBy(),
                this.getModifiedAt()
        );
    }

}