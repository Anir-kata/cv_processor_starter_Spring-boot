package com.sijo.cvprocessor;

import com.sijo.cvprocessor.dao.CandidateRepository;
import com.sijo.cvprocessor.model.Candidate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CandidateRepositoryTest {
    @Autowired
    private CandidateRepository candidateRepository;

    @Test
    public void testSaveAndFindCandidate() {
        Candidate candidate = new Candidate();
        candidate.setName("John Doe");
        candidate.setEmail("john@example.com");
        candidate.setYearsOfExperience(5);
        Candidate saved = candidateRepository.save(candidate);
        assertThat(saved.getId()).isNotNull();
        Candidate found = candidateRepository.findById(saved.getId()).orElse(null);
        assertThat(found).isNotNull();
        assertThat(found.getName()).isEqualTo("John Doe");
    }
}
