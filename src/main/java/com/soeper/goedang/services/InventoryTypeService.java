package com.soeper.goedang.services;

import com.soeper.goedang.entities.InventoryType;

public interface InventoryTypeService {
    InventoryType save(InventoryType inventoryType);
    InventoryType get(int id);
    InventoryType remove(int id);
    long count();
}
