package com.soeper.goedang.services;

import com.soeper.goedang.entities.Product;
import com.soeper.goedang.entities.ProductAttributeName;
import com.soeper.goedang.entities.ProductAttributeValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;


@SpringBootTest
public class ProductAttributeValueServiceTest {
    @Autowired
    private ProductAttributeValueService productAttributeValueService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductAttributeNameService productAttributeNameService;

    @Test
    public void add_get_remove_ProductAttributeValue() {
        var product  = new Product();
        product.setCode("test");
        product.setName("test");
        product = productService.save(product);

        var productAttributeName = new ProductAttributeName();
        productAttributeName.setName("weight");
        productAttributeName = productAttributeNameService.save(productAttributeName);

        long count = productAttributeValueService.count();
        ProductAttributeValue productAttributeValue = new ProductAttributeValue();
        productAttributeValue.setProduct(product);
        productAttributeValue.setProductAttributeName(productAttributeName);
        productAttributeValue.setValue("300 gr");
        productAttributeValue = productAttributeValueService.save(productAttributeValue);

        Assertions.assertEquals(count + 1, productAttributeValueService.count());
        Assertions.assertTrue(productAttributeValue.getId() > 0);
        productAttributeValueService.remove(productAttributeValue.getId());
        Assertions.assertEquals(count, productAttributeValueService.count());
    }
}
