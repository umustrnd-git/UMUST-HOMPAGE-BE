package com.umust.umustbe.thesis.controller;

import com.umust.umustbe.thesis.domain.Thesis;
import com.umust.umustbe.thesis.dto.ThesisDTO;
import com.umust.umustbe.thesis.dto.ThesisIdResponse;
import com.umust.umustbe.thesis.service.ThesisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ThesisController {
    private final ThesisService thesisService;

    @GetMapping("/thesis")
    public ResponseEntity<List<ThesisDTO>> getThesesByOrderByDate() {
        List<Thesis> theses = thesisService.getThesesByOrderByDate();
        List<ThesisDTO> thesesDto = theses.stream()
                .map(ThesisDTO::from)
                .toList();
        return ResponseEntity.ok().body(thesesDto);
    }

    @PostMapping("/thesis")
    public ResponseEntity<ThesisIdResponse> addArticle(ThesisDTO thesisDto) {
        return ResponseEntity.ok(thesisService.createThesis(thesisDto));
    }

}