package com.sijo.cvprocessor.controller;

import com.sijo.cvprocessor.dto.CandidateDto;
import com.sijo.cvprocessor.model.Candidate;
import com.sijo.cvprocessor.service.CandidateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping
    public Candidate create(@RequestBody CandidateDto dto) {
        return candidateService.createCandidate(dto);
    }

    @GetMapping("/{id}")
    public Candidate get(@PathVariable Long id) {
        return candidateService.getCandidate(id);
    }
}
