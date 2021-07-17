package com.hsrm.dataAccess.abstracts;

import com.hsrm.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
}

