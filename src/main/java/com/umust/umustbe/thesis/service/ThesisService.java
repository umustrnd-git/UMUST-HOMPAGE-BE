package com.umust.umustbe.thesis.service;

import com.umust.umustbe.thesis.domain.Thesis;
import com.umust.umustbe.thesis.dto.ThesisDto;
import com.umust.umustbe.thesis.dto.ThesisIdResponse;
import com.umust.umustbe.thesis.repository.ThesisRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ThesisService {
    private final ThesisRepository thesisRepository;

    /* GET) 논문 리스트 조회 readOnly 속성으로 조회속도 개선 */
    @Transactional(readOnly = true)
    public List<ThesisDto> getThesesByOrderByDate() {
        List<Thesis> theses = thesisRepository.findAllByOrderByDateDesc();
        List<ThesisDto> thesesDto = theses
                .stream()
                .map(ThesisDto::from)
                .toList();

        return thesesDto;
    }

    /* GET) 논문 단건 조회 readOnly 속성으로 조회속도 개선 */
    @Transactional(readOnly = true)
    public ThesisDto getThesisDtoById(Long thesisId) {
        Thesis thesis = thesisRepository.findById(thesisId)
                .orElseThrow(() -> new EntityNotFoundException("Thesis not found with ID: " + thesisId));

        return ThesisDto.from(thesis);
    }

    /* POST) 논문 생성 */
    @Transactional
    public ThesisIdResponse createThesis(ThesisDto thesisDto) {
        Thesis thesis = thesisDto.toEntity();
        Thesis newThesis = thesisRepository.save(thesis);
        return ThesisIdResponse.builder()
                .id(newThesis.getId())
                .build();
    }

    /* PUT) 논문 수정 */
    @Transactional
    public ThesisIdResponse updateThesis(Long id, ThesisDto thesisDto) {
        Thesis thesis = thesisRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Thesis not found with Id : " + id));

        thesis.update(thesisDto);

        return ThesisIdResponse.builder()
                .id(thesis.getId())
                .build();
    }

    /* DELETE) 논문 삭제 */
    @Transactional
    public void delete(Long id) {
        Thesis thesis = thesisRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));

        thesisRepository.delete(thesis);
    }
}
