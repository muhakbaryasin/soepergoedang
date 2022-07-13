package com.soeper.goedang.dao;


import com.soeper.goedang.entities.PacketPackageType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PacketPackageTypeDao extends JpaRepository<PacketPackageType, Integer> {
}
