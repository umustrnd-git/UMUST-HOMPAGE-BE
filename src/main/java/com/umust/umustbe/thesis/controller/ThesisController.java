package com.umust.umustbe.thesis.controller;

import com.umust.umustbe.article.dto.BaseResponseBody;
import com.umust.umustbe.thesis.dto.ThesisDto;
import com.umust.umustbe.thesis.dto.ThesisIdResponse;
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
        return ResponseEntity.ok().body(thesisService.getThesesByOrderByDate());
    }

    @GetMapping("/thesis/{id}")
    public ResponseEntity<ThesisDto> getTheisById(@PathVariable Long id) {
        return ResponseEntity.ok().body(thesisService.getThesisDtoById(id));
    }

    @PostMapping("/thesis")
    public ResponseEntity<ThesisIdResponse> addThesis(@RequestBody ThesisDto thesisDto) {
        return ResponseEntity.ok().body(thesisService.createThesis(thesisDto));
    }

    @PutMapping("/thesis/{id}")
    public ResponseEntity<ThesisIdResponse> updateThesis(
            @PathVariable Long id,
            @RequestBody ThesisDto thesisDto) {
        return ResponseEntity.ok().body(thesisService.updateThesis(id, thesisDto));
    }

    @DeleteMapping("/thesis/{id}")
    public ResponseEntity<BaseResponseBody> deleteThesis(@PathVariable Long id){
        thesisService.delete(id);
        return ResponseEntity.ok(BaseResponseBody.of(200, "게시글 삭제 성공"));
    }
}