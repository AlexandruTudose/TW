package com.asciipic.services.job;

import com.asciipic.models.Job;
import com.asciipic.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private JobRepository repository;

    @Override
    public List<Job> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Job getById(Long id) {
        return this.repository.findOne(id);
    }

    @Override
    public Job save(Job entity) {
        return this.repository.save(entity);
    }

}
