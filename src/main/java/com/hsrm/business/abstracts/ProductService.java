package com.hsrm.business.abstracts;

import com.hsrm.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

}
