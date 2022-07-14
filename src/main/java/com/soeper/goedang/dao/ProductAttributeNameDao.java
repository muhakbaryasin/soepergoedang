package com.soeper.goedang.dao;

import com.soeper.goedang.entities.ProductAttributeName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductAttributeNameDao extends JpaRepository<ProductAttributeName, Integer> {
}
