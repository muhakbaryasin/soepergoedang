package com.soeper.goedang.services;

import com.soeper.goedang.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void add_get_remove_Customer() {
        long count = userService.count();
        User user = new User();
        user.setUserName("test");
        user.setFullName("test");
        user.setPassword("test");
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());

        user = userService.add(user);
        Assertions.assertEquals(count + 1, userService.count());
        Assertions.assertTrue(user.getId() > 0);
        userService.remove(user.getId());
        Assertions.assertEquals(count, userService.count());
    }
}
