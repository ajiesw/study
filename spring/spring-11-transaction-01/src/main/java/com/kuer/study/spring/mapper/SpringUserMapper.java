package com.kuer.study.spring.mapper;

import com.kuer.study.spring.pojo.User;

import java.util.List;

/**
 * @author kuer
 */
public interface SpringUserMapper {
    /**
     *
     *
     * @return
     */
    List<User> queryList();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
