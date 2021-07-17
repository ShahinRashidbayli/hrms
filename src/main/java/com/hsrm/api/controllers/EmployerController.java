package com.hsrm.api.controllers;

import com.hsrm.business.abstracts.EmployerService;
import com.hsrm.core.utilities.results.Result;
import com.hsrm.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {

    private EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        super();
        this.employerService = employerService;
    }

    @PostMapping("/add")
    private Result add(Employer employer) {
        return this.employerService.add(employer);
    }
}
