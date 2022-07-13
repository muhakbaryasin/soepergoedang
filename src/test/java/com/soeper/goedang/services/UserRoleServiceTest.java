package com.soeper.goedang.services;

import com.soeper.goedang.entities.UserRole;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;


@SpringBootTest
public class UserRoleServiceTest {
    @Autowired
    private UserRoleService userRoleService;

    @Test
    public void add_get_remove_UserRole() {
        long count = userRoleService.count();
        UserRole userRole = new UserRole();
        userRole.setName("test");
        userRole.setCreatedAt(new Date());
        userRole.setUpdatedAt(new Date());

        userRole = userRoleService.save(userRole);
        Assertions.assertEquals(count + 1, userRoleService.count());
        Assertions.assertTrue(userRole.getId() > 0);
        userRoleService.remove(userRole.getId());
        Assertions.assertEquals(count, userRoleService.count());
    }
}
