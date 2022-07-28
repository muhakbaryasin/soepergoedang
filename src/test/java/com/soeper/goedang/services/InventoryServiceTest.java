package com.soeper.goedang.services;

import com.soeper.goedang.entities.Inventory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class InventoryServiceTest {
    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private InventoryTypeService inventoryTypeService;

    @Test
    public void add_get_remove_Inventory() {
        long count = inventoryService.count();
        var inventoryType = inventoryTypeService.get(1);
        var inventory = new Inventory();
        inventory.setName("test");
        inventory.setInventoryType(inventoryType);
        inventory.setCreatedAt(new Date());
        inventory.setUpdatedAt(new Date());
        inventory = inventoryService.save(inventory);
        Assertions.assertEquals(count + 1, inventoryService.count());
        Assertions.assertTrue(inventory.getId() > 1);
        inventoryService.remove(inventory.getId());
        Assertions.assertEquals(count, inventoryService.count());
    }
}
