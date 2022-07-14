package com.soeper.goedang.services;

import com.soeper.goedang.entities.ProductAttributeName;
import org.springframework.stereotype.Service;


@Service
public interface ProductAttributeNameService {
    ProductAttributeName save(ProductAttributeName productAttributeName);
    ProductAttributeName get(int id);
    ProductAttributeName remove(int id);
    long count();
}
