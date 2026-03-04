package com.sijo.cvprocessor.service;

import com.sijo.cvprocessor.dao.JobDao;
import com.sijo.cvprocessor.model.Job;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {
    private final JobDao jobDao;

    @Autowired
    public JobServiceImpl(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public Job save(Job job) {
        return jobDao.save(job);
    }

    @Override
    public Job findById(Long id) {
        return jobDao.findById(id);
    }

    @Override
    public List<Job> findAll() {
        return jobDao.findAll();
    }

    @Override
    public void deleteById(Long id) {
        jobDao.deleteById(id);
    }
}
