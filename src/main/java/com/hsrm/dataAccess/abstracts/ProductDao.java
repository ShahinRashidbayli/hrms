package com.hsrm.dataAccess.abstracts;

import com.hsrm.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
