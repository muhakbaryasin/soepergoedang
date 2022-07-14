package com.soeper.goedang.dao;

import com.soeper.goedang.entities.ProductAttributeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductAttributeValueDao extends JpaRepository<ProductAttributeValue, Integer> {
}
