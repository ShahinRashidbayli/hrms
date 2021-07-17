package com.hsrm.api.controllers;

import com.hsrm.business.abstracts.JobSeekerService;
import com.hsrm.core.utilities.results.Result;
import com.hsrm.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekerController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService) {
        super();
        this.jobSeekerService = jobSeekerService;
    }

    @PostMapping("/add")
    public Result add(JobSeeker jobSeeker) {
        return this.jobSeekerService.add(jobSeeker);
    }

}
