package icu.junyao.dubbo.service.impl;

import icu.junyao.dubbo.domain.User;
import icu.junyao.dubbo.service.UserService;

/**
 * @author wu
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setAge(18);
        user.setUsername("vanessa");
        user.setId(id);
        return user;
    }
}
