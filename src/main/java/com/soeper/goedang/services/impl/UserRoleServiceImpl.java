package com.soeper.goedang.services.impl;

import com.soeper.goedang.dao.UserRoleDao;
import com.soeper.goedang.entities.UserRole;
import com.soeper.goedang.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public UserRole save(UserRole userRole) {
        return userRoleDao.save(userRole);
    }

    @Override
    public UserRole get(int id) {
        return userRoleDao.findById(id).orElse(null);
    }

    @Override
    public UserRole remove(int id) {
        UserRole userRole = get(id);

        if (userRole != null)
            userRoleDao.delete(userRole);

        return userRole;
    }

    @Override
    public long count() {
        return userRoleDao.count();
    }
}
