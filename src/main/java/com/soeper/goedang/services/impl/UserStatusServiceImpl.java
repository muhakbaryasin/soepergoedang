package com.soeper.goedang.services.impl;

import com.soeper.goedang.dao.UserStatusDao;
import com.soeper.goedang.entities.UserStatus;
import com.soeper.goedang.services.UserStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserStatusServiceImpl implements UserStatusService {
    @Autowired
    UserStatusDao userStatusDao;

    @Override
    public UserStatus save(UserStatus userStatus) {
        return userStatusDao.save(userStatus);
    }

    @Override
    public UserStatus get(int id) {
        return userStatusDao.findById(id).orElse(null);
    }

    @Override
    public UserStatus remove(int id) {
        UserStatus userStatus = get(id);

        if (userStatus != null)
            userStatusDao.delete(userStatus);

        return userStatus;
    }

    @Override
    public long count() {
        return userStatusDao.count();
    }
}
