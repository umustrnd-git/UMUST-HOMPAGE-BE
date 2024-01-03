package com.umust.umustbe.thesis.dto;

import com.umust.umustbe.thesis.domain.Thesis;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ThesisDto {
    private String title;
    private Date date;
    private String journal;
    private String authors;
    private String link;

    public Thesis toEntity() {
        return Thesis.builder()
                .title(title)
                .date(date)
                .journal(journal)
                .authors(authors)
                .link(link)
                .build();
    }

    public static ThesisDto from(Thesis entity) {
        return new ThesisDto(
                entity.getTitle(),
                entity.getDate(),
                entity.getJournal(),
                entity.getAuthors(),
                entity.getLink()
        );
    }

    public ThesisDto (Thesis entity) {
        this.title = entity.getTitle();
        this.date = entity.getDate();
        this.journal = entity.getJournal();
        this.authors = entity.getAuthors();
        this.link = entity.getLink();
    }
}
