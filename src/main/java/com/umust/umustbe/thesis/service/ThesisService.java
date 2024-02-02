package com.umust.umustbe.thesis.service;

import com.umust.umustbe.thesis.domain.Thesis;
import com.umust.umustbe.thesis.dto.ThesisDTO;
import com.umust.umustbe.thesis.dto.ThesisIdResponse;
import com.umust.umustbe.thesis.repository.ThesisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ThesisService {
    private final ThesisRepository thesisRepository;

    @Transactional
    public ThesisIdResponse createThesis(ThesisDTO thesisDto) {
        Thesis thesis = thesisDto.toEntity();
        Thesis savedThesis = thesisRepository.save(thesis);
        return new ThesisIdResponse(savedThesis);
    }

    @Transactional(readOnly = true)
    public List<Thesis> getThesesByOrderByDate() {
        return thesisRepository.findAllByOrderByDateDesc();
    }

    @Transactional(readOnly = true)
    public Thesis getThesisById(Long id) {
        return thesisRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Thesis not found with Id : " + id));
    }

    @Transactional
    public Thesis update(long id, ThesisDTO thesisDto) {
        Thesis thesis = thesisRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Thesis not found with Id : " + id));

        thesis.update(thesisDto);

        return thesis;
    }

    @Transactional
    public void delete(long id) {
        Thesis thesis = thesisRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));

        thesisRepository.delete(thesis);
    }
}
