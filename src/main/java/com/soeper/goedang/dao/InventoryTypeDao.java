package com.soeper.goedang.dao;

import com.soeper.goedang.entities.InventoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryTypeDao extends JpaRepository<InventoryType, Integer> {
}
