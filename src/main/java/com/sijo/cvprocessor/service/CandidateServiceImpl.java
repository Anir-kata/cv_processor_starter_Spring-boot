package com.sijo.cvprocessor.service;

import com.sijo.cvprocessor.dao.CandidateDao;
import com.sijo.cvprocessor.dto.CandidateDto;
import com.sijo.cvprocessor.model.Candidate;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService {

    private final CandidateDao candidateDao;

    public CandidateServiceImpl(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public Candidate createCandidate(CandidateDto dto) {
        Candidate c = new Candidate();
        c.setName(dto.getName());
        c.setEmail(dto.getEmail());
        c.setYearsOfExperience(dto.getYearsOfExperience());
        return candidateDao.save(c);
    }

    @Override
    public Candidate getCandidate(Long id) {
        return candidateDao.findById(id).orElseThrow(() -> new RuntimeException("Candidate not found"));
    }

    @Override
    public Candidate updateCandidate(Long id, CandidateDto dto) {
        Candidate existing = candidateDao.findById(id).orElseThrow(() -> new RuntimeException("Candidate not found"));
        existing.setName(dto.getName());
        existing.setEmail(dto.getEmail());
        existing.setYearsOfExperience(dto.getYearsOfExperience());
        return candidateDao.save(existing);
    }
}
