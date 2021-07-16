package com.hsrm.business.concretes;

import com.hsrm.business.abstracts.ProductService;
import com.hsrm.core.utilities.results.DataResult;
import com.hsrm.core.utilities.results.Result;
import com.hsrm.core.utilities.results.SuccessDataResult;
import com.hsrm.core.utilities.results.SuccessResult;
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
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),
                "Data listelendi.");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Urun eklendi.");
    }
}
