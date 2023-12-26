package com.umust.umustbe.thesis.controller;

import com.umust.umustbe.thesis.ThesisDto;
import com.umust.umustbe.thesis.domain.Thesis;
import com.umust.umustbe.thesis.dto.ThesisDto;
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
@RequestMapping("/thesis")
public class ThesisController {
    private final ThesisService thesisService;

    @GetMapping
    public ResponseEntity<List<ThesisDto>> getThesesByOrderByDate() {
        List<Thesis> theses = thesisService.getThesesByOrderByDate();
        return ResponseEntity.ok().body(theses);
    }

    @PostMapping
    public ResponseEntity<Thesis> addArticle


}