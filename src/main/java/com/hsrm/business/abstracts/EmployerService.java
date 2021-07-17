package com.hsrm.business.abstracts;

import com.hsrm.core.utilities.results.Result;

import com.hsrm.entities.concretes.Employer;

public interface EmployerService {

    Result add(Employer employer);
}
