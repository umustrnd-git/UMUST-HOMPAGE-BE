package com.umust.umustbe.thesis.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.umust.umustbe.thesis.domain.Thesis;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ThesisDTO {
    private String title;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
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

    public static ThesisDTO from(Thesis entity) {
        return new ThesisDTO(
                entity.getTitle(),
                entity.getDate(),
                entity.getJournal(),
                entity.getAuthors(),
                entity.getLink()
        );
    }

}