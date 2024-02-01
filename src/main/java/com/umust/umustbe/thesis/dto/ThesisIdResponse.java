package com.umust.umustbe.thesis.dto;

import com.umust.umustbe.thesis.domain.Thesis;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ThesisIdResponse {
    private Long id;

    public ThesisIdResponse(Thesis thesis) {
        this.id = thesis.getId();
    }
}
