package com.hsrm.business.concretes;

import com.hsrm.business.abstracts.EmployerService;
import com.hsrm.core.utilities.results.Result;
import com.hsrm.core.utilities.results.SuccessResult;
import com.hsrm.dataAccess.abstracts.EmployerDao;
import com.hsrm.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;
    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("Employer added.");
    }
}


