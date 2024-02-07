package com.umust.umustbe.thesis.controller;

import com.umust.umustbe.thesis.domain.Thesis;
import com.umust.umustbe.thesis.dto.ThesisDto;
import com.umust.umustbe.thesis.service.ThesisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ThesisController {
    private final ThesisService thesisService;

    @GetMapping("/thesis")
    public ResponseEntity<List<ThesisDto>> getThesesByOrderByDate() {
        List<Thesis> theses = thesisService.getThesesByOrderByDate();
        List<ThesisDto> thesesDto = theses
                .stream()
                .map(ThesisDto::new)
                .toList();
        return ResponseEntity.ok().body(thesesDto);
    }

    @PostMapping("/thesis")
    public ResponseEntity addArticle(@RequestBody ThesisDto thesisDto) {
        return ResponseEntity.ok(thesisService.createThesis(thesisDto));
    }


}