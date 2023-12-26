package com.umust.umustbe.thesis.repository;

import com.umust.umustbe.thesis.domain.Thesis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThesisRepository extends JpaRepository<Thesis, Long> {
    List<Thesis> findAllByOrderByDate();
}
