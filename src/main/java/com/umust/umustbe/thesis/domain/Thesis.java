package com.umust.umustbe.thesis.domain;

import com.umust.umustbe.thesis.dto.ThesisDTO;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Thesis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "journal")
    private String journal;

    @Column(name = "author", nullable = false)
    private String authors;

    @Column(name = "link")
    private String link;

    @Builder
    public Thesis(Long id, String title, Date date, String journal, String authors, String link) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.authors = authors;
        this.journal = journal;
        this.link = link;
    }

    public Thesis update(ThesisDTO thesisDto) {
        this.title = thesisDto.getTitle();
        this.date = thesisDto.getDate();
        this.journal = thesisDto.getJournal();
        this.authors = thesisDto.getAuthors();
        this.link = thesisDto.getLink();
        return this;
    }
}
