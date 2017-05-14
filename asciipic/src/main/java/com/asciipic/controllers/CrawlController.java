package com.asciipic.controllers;

import com.asciipic.models.Job;
import com.asciipic.services.job.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Alexandru on 5/14/2017.
 */

@RestController
@RequestMapping("/crawl")
public class CrawlController {

    @Autowired
    private JobService jobService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Job>> getJobs() {
        List<Job> jobs = this.jobService.getAll();
        if (jobs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addJob(@RequestBody Job job) {
        this.jobService.save(job);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
