package com.alumni.controller;

import com.alumni.model.JobPost;
import com.alumni.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    // @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // Alumni can post jobs
    @PostMapping
    public ResponseEntity<JobPost> postJob(@RequestBody JobPost jobPost) {
        JobPost createdJob = jobService.createJob(jobPost);
        return new ResponseEntity<>(createdJob, HttpStatus.CREATED);
    }

    // Students (and everyone) can see all jobs
    @GetMapping
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }
}
