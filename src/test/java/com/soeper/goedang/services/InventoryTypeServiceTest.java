package com.soeper.goedang.services;

import com.soeper.goedang.entities.InventoryType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class InventoryTypeServiceTest {
    @Autowired
    private InventoryTypeService inventoryTypeService;

    @Test
    public void add_get_remove_InventoryType() {
        long count = inventoryTypeService.count();
        var inventoryType = new InventoryType();
        inventoryType.setName("test");
        inventoryType.setCreatedAt(new Date());
        inventoryType.setUpdatedAt(new Date());

        inventoryType = inventoryTypeService.save(inventoryType);
        Assertions.assertEquals(count + 1, inventoryTypeService.count());
        Assertions.assertTrue(inventoryType.getId() > 0);
        inventoryTypeService.remove(inventoryType.getId());
        Assertions.assertEquals(count, inventoryTypeService.count());
    }
}
