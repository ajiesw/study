package com.kuer.study.mapper;

import com.kuer.study.pojo.User;

import java.util.List;

/**
 * @author kuer
 */
public interface SpringUserMapper {

    /**
     * getList
     * @param user
     * @return
     */
    List<User> getList(User user);
}
