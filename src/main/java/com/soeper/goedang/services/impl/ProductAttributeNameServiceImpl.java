package com.soeper.goedang.services.impl;

import com.soeper.goedang.dao.ProductAttributeNameDao;
import com.soeper.goedang.entities.ProductAttributeName;
import com.soeper.goedang.services.ProductAttributeNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductAttributeNameServiceImpl implements ProductAttributeNameService {
    @Autowired
    private ProductAttributeNameDao productAttributeNameDao;

    @Override
    public ProductAttributeName save(ProductAttributeName productAttributeName) {
        return productAttributeNameDao.save(productAttributeName);
    }

    @Override
    public ProductAttributeName get(int id) {
        return productAttributeNameDao.findById(id).orElse(null);
    }

    @Override
    public ProductAttributeName remove(int id) {
        var productAttributeName = get(id);

        if (productAttributeName != null)
            productAttributeNameDao.delete(productAttributeName);

        return productAttributeName;
    }

    @Override
    public long count() {
        return productAttributeNameDao.count();
    }
}
