package com.soeper.goedang.services;

import com.soeper.goedang.entities.ProductAttributeName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;


@SpringBootTest
public class ProductAttributeNameServiceTest {
    @Autowired
    private ProductAttributeNameService productAttributeNameService;

    @Test
    public void add_get_remove_UserRole() {
        long count = productAttributeNameService.count();
        ProductAttributeName productAttributeName = new ProductAttributeName();
        productAttributeName.setName("test");
        productAttributeName.setCreatedAt(new Date());
        productAttributeName.setUpdatedAt(new Date());

        productAttributeName = productAttributeNameService.save(productAttributeName);
        Assertions.assertEquals(count + 1, productAttributeNameService.count());
        Assertions.assertTrue(productAttributeName.getId() > 0);
        productAttributeNameService.remove(productAttributeName.getId());
        Assertions.assertEquals(count, productAttributeNameService.count());
    }
}
