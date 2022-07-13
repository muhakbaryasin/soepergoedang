package com.soeper.goedang.services.impl;

import com.soeper.goedang.dao.ProductDao;
import com.soeper.goedang.entities.Product;
import com.soeper.goedang.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Override
    public Product get(int id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public Product remove(int id) {
        Product product = get(id);

        if (product != null)
            productDao.delete(product);

        return product;
    }

    @Override
    public long count() {
        return productDao.count();
    }
}
