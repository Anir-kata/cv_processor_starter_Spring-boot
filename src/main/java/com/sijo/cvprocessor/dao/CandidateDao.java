package com.sijo.cvprocessor.dao;

import com.sijo.cvprocessor.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate, Long> {
}
