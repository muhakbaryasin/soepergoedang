package com.soeper.goedang.services;

import com.soeper.goedang.entities.InventoryProduct;

public interface InventoryProductService {
    InventoryProduct save(InventoryProduct inventoryProduct);
    InventoryProduct get(int id);
    InventoryProduct remove(int id);
    long count();
}
