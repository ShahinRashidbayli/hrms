package com.hsrm.business.abstracts;

import com.hsrm.core.utilities.results.DataResult;
import com.hsrm.core.utilities.results.Result;
import com.hsrm.entities.concretes.Product;

import java.util.List;

public interface ProductService {

    DataResult<List<Product>> getAll();

    Result add(Product product);

}
