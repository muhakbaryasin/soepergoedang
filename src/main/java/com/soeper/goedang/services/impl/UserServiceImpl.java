package com.soeper.goedang.services.impl;

import com.soeper.goedang.dao.UserDao;
import com.soeper.goedang.entities.User;
import com.soeper.goedang.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User get(int id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public User remove(int id) {
        User user = get(id);

        if (user != null)
            userDao.delete(user);

        return user;
    }

    @Override
    public long count() {
        return userDao.count();
    }
}
