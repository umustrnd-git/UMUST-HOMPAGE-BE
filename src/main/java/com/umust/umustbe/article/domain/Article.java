package com.umust.umustbe.article.domain;

import com.umust.umustbe.common.AuditingFields;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article extends AuditingFields {

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

}