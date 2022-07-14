package com.soeper.goedang.services;

import com.soeper.goedang.entities.ProductAttributeValue;
import org.springframework.stereotype.Service;


@Service
public interface ProductAttributeValueService {
    ProductAttributeValue save(ProductAttributeValue productAttributeValue);
    ProductAttributeValue get(int id);
    ProductAttributeValue remove(int id);
    long count();
}
