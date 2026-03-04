package com.sijo.cvprocessor;

import com.sijo.cvprocessor.dao.JobRepository;
import com.sijo.cvprocessor.model.Job;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JobRepositoryTest {
    @Autowired
    private JobRepository jobRepository;

    @Test
    public void testSaveAndFindJob() {
        Job job = new Job();
        job.setTitle("Développeur Java");
        job.setDescription("Développement d'applications Java");
        job.setLocation("Paris");
        Job saved = jobRepository.save(job);
        assertThat(saved.getId()).isNotNull();
        Job found = jobRepository.findById(saved.getId()).orElse(null);
        assertThat(found).isNotNull();
        assertThat(found.getTitle()).isEqualTo("Développeur Java");
    }
}
