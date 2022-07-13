package com.soeper.goedang.dao;

import com.soeper.goedang.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRoleDao extends JpaRepository<UserRole, Integer> {
}
