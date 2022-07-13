package com.soeper.goedang.services;


import com.soeper.goedang.entities.UserStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserStatusServiceTest {
    @Autowired
    private UserStatusService userStatusService;

    @Test
    public void add_get_remove_UserStatus() {
        long count = userStatusService.count();
        UserStatus userStatus = new UserStatus();
        userStatus.setName("test");
        userStatus.setCreatedAt(new Date());
        userStatus.setUpdatedAt(new Date());

        userStatus = userStatusService.save(userStatus);
        Assertions.assertEquals(count + 1, userStatusService.count());
        Assertions.assertTrue(userStatus.getId() > 0);
        userStatusService.remove(userStatus.getId());
        Assertions.assertEquals(count, userStatusService.count());
    }
}
