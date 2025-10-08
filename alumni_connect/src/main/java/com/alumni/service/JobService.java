package com.alumni.service;

import com.alumni.model.JobPost;
import com.alumni.repository.JobPostRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    // @Autowired
    private JobPostRepository jobPostRepository;

    public JobPost createJob(JobPost jobPost) {
        return jobPostRepository.save(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobPostRepository.findAll();
    }
}
