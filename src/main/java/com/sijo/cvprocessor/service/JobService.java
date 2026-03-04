package com.sijo.cvprocessor.service;

import com.sijo.cvprocessor.model.Job;
import java.util.List;

public interface JobService {
    Job save(Job job);
    Job findById(Long id);
    List<Job> findAll();
    void deleteById(Long id);
}
