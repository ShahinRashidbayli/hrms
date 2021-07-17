package com.hsrm.business.abstracts;

import com.hsrm.core.utilities.results.Result;
import com.hsrm.entities.concretes.JobSeeker;

public interface JobSeekerService {

    Result add(JobSeeker jobSeeker);
}


