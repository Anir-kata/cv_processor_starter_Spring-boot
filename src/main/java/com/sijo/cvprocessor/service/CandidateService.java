package com.sijo.cvprocessor.service;

import com.sijo.cvprocessor.dto.CandidateDto;
import com.sijo.cvprocessor.model.Candidate;

public interface CandidateService {

    Candidate createCandidate(CandidateDto dto);

    Candidate getCandidate(Long id);

    Candidate updateCandidate(Long id, CandidateDto dto);
}
