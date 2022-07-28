package com.soeper.goedang.services.impl;

import com.soeper.goedang.dao.InventoryDao;
import com.soeper.goedang.entities.Inventory;
import com.soeper.goedang.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryDao inventoryDao;

    @Override
    public Inventory save(Inventory inventory) {
        return inventoryDao.save(inventory);
    }

    @Override
    public Inventory get(int id) {
        return inventoryDao.findById(id).orElse(null);
    }

    @Override
    public Inventory remove(int id) {
        var inventory = get(id);

        if (inventory != null)
            inventoryDao.delete(inventory);

        return inventory;
    }

    @Override
    public long count() {
        return inventoryDao.count();
    }
}
