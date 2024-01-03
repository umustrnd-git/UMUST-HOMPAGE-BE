package com.umust.umustbe.article.repository;

import com.umust.umustbe.article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
