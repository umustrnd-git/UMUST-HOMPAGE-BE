package com.umust.umustbe.file.repository;

import com.umust.umustbe.article.domain.Article;
import com.umust.umustbe.file.domain.ArticleFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface fileRepository extends JpaRepository<ArticleFile, Long> {
    void deleteByArticle(Article article);

    List<ArticleFile> findByArticle(Article article);
}