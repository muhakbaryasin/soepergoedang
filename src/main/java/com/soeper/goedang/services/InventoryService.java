package com.soeper.goedang.services;

import com.soeper.goedang.entities.Inventory;

public interface InventoryService {
    Inventory save(Inventory inventory);
    Inventory get(int id);
    Inventory remove(int id);
    long count();
}
