package com.soeper.goedang.services.impl;

import com.soeper.goedang.dao.ProductAttributeValueDao;
import com.soeper.goedang.entities.ProductAttributeValue;
import com.soeper.goedang.services.ProductAttributeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductAttributeValueServiceImpl implements ProductAttributeValueService {
    @Autowired
    private ProductAttributeValueDao productAttributeValueDao;

    @Override
    public ProductAttributeValue save(ProductAttributeValue productAttributeValue) {
        return productAttributeValueDao.save(productAttributeValue);
    }

    @Override
    public ProductAttributeValue get(int id) {
        return productAttributeValueDao.findById(id).orElse(null);
    }

    @Override
    public ProductAttributeValue remove(int id) {
        var productAttributeValue = get(id);

        if (productAttributeValue != null)
            productAttributeValueDao.delete(productAttributeValue);

        return productAttributeValue;
    }

    @Override
    public long count() {
        return productAttributeValueDao.count();
    }
}
