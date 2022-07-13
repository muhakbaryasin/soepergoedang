package com.soeper.goedang.services;

import com.soeper.goedang.entities.UserStatus;

public interface UserStatusService {
    UserStatus save(UserStatus userStatus);
    UserStatus get(int id);
    UserStatus remove(int id);
    long count();
}
