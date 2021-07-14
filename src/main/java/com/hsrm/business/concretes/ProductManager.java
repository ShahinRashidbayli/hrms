package com.hsrm.business.concretes;

import com.hsrm.business.abstracts.ProductService;
import com.hsrm.dataAccess.abstracts.ProductDao;
import com.hsrm.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //arch business isini gorecek classdir demis oluruq
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
