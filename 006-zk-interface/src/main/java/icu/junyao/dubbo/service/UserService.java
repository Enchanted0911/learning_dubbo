package icu.junyao.dubbo.service;

import icu.junyao.dubbo.domain.User;

/**
 * @author wu
 */
public interface UserService {
    /**
     * 通过id查找一个用户
     * @param id 用户id
     * @return 返回查找到的用户
     */
    User queryUserById(Integer id);
}
