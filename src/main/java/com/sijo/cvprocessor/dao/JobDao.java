package com.sijo.cvprocessor.dao;

import com.sijo.cvprocessor.model.Job;
import java.util.List;

public interface JobDao {
    Job save(Job job);
    Job findById(Long id);
    List<Job> findAll();
    void deleteById(Long id);
}
