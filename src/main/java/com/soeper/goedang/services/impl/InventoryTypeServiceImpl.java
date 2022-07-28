package com.soeper.goedang.services.impl;

import com.soeper.goedang.dao.InventoryTypeDao;
import com.soeper.goedang.entities.InventoryType;
import com.soeper.goedang.services.InventoryTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryTypeServiceImpl implements InventoryTypeService {
    @Autowired
    private InventoryTypeDao inventoryTypeDao;

    @Override
    public InventoryType save(InventoryType inventoryType) {
        return inventoryTypeDao.save(inventoryType);
    }

    @Override
    public InventoryType get(int id) {
        return inventoryTypeDao.findById(id).orElse(null);
    }

    @Override
    public InventoryType remove(int id) {
        var inventoryType = get(id);

        if (inventoryType != null)
            inventoryTypeDao.delete(inventoryType);

        return inventoryType;
    }

    @Override
    public long count() {
        return inventoryTypeDao.count();
    }
}
