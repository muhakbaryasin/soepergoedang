package com.soeper.goedang.services;

import com.soeper.goedang.entities.UserRole;

public interface UserRoleService {
    UserRole save(UserRole userRole);
    UserRole get(int id);
    UserRole remove(int id);
    long count();
}
