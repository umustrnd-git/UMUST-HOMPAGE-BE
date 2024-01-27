package com.umust.umustbe.image.domain;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.common.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ArticleImage extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_img_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false) //
    private Article article;

    @Column(name = "img_url", nullable = false)
    private String imgUrl;

}