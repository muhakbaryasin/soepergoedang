package com.soeper.goedang.services;

import com.soeper.goedang.entities.Product;

public interface ProductService {
    Product save(Product product);
    Product get(int id);
    Product remove(int id);
    long count();
}
