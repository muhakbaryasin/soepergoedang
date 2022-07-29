package com.soeper.goedang.services;

import com.soeper.goedang.entities.InventoryProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class InventoryProductServiceTest {
    @Autowired
    private InventoryProductService inventoryProductService;

    @Autowired
    private ProductService productService;

    @Autowired
    private InventoryService inventoryService;


    @Test
    public void add_get_delete_InventoryProduct() {
        long count = inventoryProductService.count();
        var inventoryProduct = new InventoryProduct();
        inventoryProduct.setProduct(productService.get(1));
        inventoryProduct.setInventory(inventoryService.get(1));
        inventoryProduct.setPrice(Long.valueOf(10000));
        inventoryProduct.setCreatedAt(new Date());
        inventoryProduct.setUpdatedAt(new Date());
        inventoryProduct = inventoryProductService.save(inventoryProduct);
        Assertions.assertEquals(count + 1, inventoryProductService.count());
        Assertions.assertTrue(inventoryProduct.getId() > 1);
        inventoryProductService.remove(inventoryProduct.getId());
        Assertions.assertEquals(count, inventoryProductService.count());
    }
}
