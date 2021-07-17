package com.hsrm.business.concretes;

import com.hsrm.business.abstracts.JobSeekerService;
import com.hsrm.core.utilities.results.Result;
import com.hsrm.core.utilities.results.SuccessResult;
import com.hsrm.dataAccess.abstracts.JobSeekerDao;
import com.hsrm.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        super();
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public Result add(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("JobSeeker added.");
    }
}
