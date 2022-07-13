package com.soeper.goedang.services;

import com.soeper.goedang.entities.Product;
import com.soeper.goedang.entities.UserStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class ProductServiceTest {
    @Autowired
    private ProductService productService;

    @Test
    public void add_get_remove_Product() {
        long count = productService.count();
        Product product = new Product();
        product.setName("test");
        product.setCode("test");
        product.setCreatedAt(new Date());
        product.setUpdatedAt(new Date());

        product = productService.save(product);
        Assertions.assertEquals(count + 1, productService.count());
        Assertions.assertTrue(product.getId() > 0);
        productService.remove(product.getId());
        Assertions.assertEquals(count, productService.count());
    }
}
