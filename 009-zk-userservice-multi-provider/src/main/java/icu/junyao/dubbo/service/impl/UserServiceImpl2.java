package icu.junyao.dubbo.service.impl;

import icu.junyao.dubbo.domain.User;
import icu.junyao.dubbo.service.UserService;

/**
 * @author wu
 */
public class UserServiceImpl2 implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setAge(28);
        user.setUsername("charlotte");
        user.setId(id);
        return user;
    }
}
