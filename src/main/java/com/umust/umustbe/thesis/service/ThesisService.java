package com.umust.umustbe.thesis.service;

import com.umust.umustbe.thesis.domain.Thesis;
import com.umust.umustbe.thesis.dto.ThesisDto;
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

    public Long createThesis(ThesisDto thesisDto) {
        Thesis thesis = thesisDto.toEntity();
        Thesis newThesis = thesisRepository.save(thesis);
        return newThesis.getId();
    }

    public List<Thesis> getThesesByOrderByDate() {
        return thesisRepository.findAllByOrderByDateDesc();
    }

    public Thesis getThesisById(Long id) {
        return thesisRepository.findById(id)
                .orElseThrow(() -> new NullPointerException());
    }

    public ThesisDto getThesisDto(Long thesisId) {
        Thesis thesis = thesisRepository.findById(thesisId)
                .orElseThrow(() -> new EntityNotFoundException("Thesis not found with ID: " + thesisId));

        return ThesisDto.from(thesis);
    }

    @Transactional
    public Thesis update(long id,ThesisDto thesisDto) {
        Thesis thesis = thesisRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Thesis not found with Id : " + id));

        thesis.update(thesisDto);

        return thesis;
    }

    public void delete(long id) {
        Thesis thesis = thesisRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));

        thesisRepository.delete(thesis);
    }
}
