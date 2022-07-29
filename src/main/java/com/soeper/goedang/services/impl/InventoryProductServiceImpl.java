package com.soeper.goedang.services.impl;

import com.soeper.goedang.dao.InventoryProductDao;
import com.soeper.goedang.entities.InventoryProduct;
import com.soeper.goedang.services.InventoryProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InventoryProductServiceImpl implements InventoryProductService {
    @Autowired
    private InventoryProductDao inventoryProductDao;

    @Override
    public InventoryProduct save(InventoryProduct inventoryProduct) {
        return inventoryProductDao.save(inventoryProduct);
    }

    @Override
    public InventoryProduct get(int id) {
        return inventoryProductDao.findById(id).orElse(null);
    }

    @Override
    public InventoryProduct remove(int id) {
        var inventoryProduct = get(id);

        if (inventoryProduct != null)
            inventoryProductDao.delete(inventoryProduct);

        return inventoryProduct;
    }

    @Override
    public long count() {
        return inventoryProductDao.count();
    }
}
