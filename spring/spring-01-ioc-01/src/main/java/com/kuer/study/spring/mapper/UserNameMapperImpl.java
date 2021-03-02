package com.kuer.study.spring.mapper;

import com.kuer.study.spring.pojo.User;

/**
 * @author kuer
 */
public class UserNameMapperImpl implements UserMapper{
    @Override
    public User getUser() {
        System.out.println("UserNameMapperImpl实现类");
        return null;
    }
}
