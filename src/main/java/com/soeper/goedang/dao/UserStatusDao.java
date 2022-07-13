package com.soeper.goedang.dao;

import com.soeper.goedang.entities.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserStatusDao extends JpaRepository<UserStatus, Integer> {
}
