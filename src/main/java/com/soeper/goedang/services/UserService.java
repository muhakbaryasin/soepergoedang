package com.soeper.goedang.services;

import com.soeper.goedang.entities.User;

public interface UserService {
    User save(User user);
    User get(int id);
    User remove(int id);
    long count();
}
