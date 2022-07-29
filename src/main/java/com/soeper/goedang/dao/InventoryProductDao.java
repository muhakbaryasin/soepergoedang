package com.soeper.goedang.dao;

import com.soeper.goedang.entities.InventoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryProductDao extends JpaRepository<InventoryProduct, Integer> {
}
