package com.kuer.study.spring.mapper;

import com.kuer.study.spring.pojo.User;

import java.sql.SQLOutput;

/**
 * @author wangkaijie
 * @ClassName UserMapperImpl.java
 * @createTime 2021年03月02日 15:43:00
 */
public class UserMapperImpl implements UserMapper{
    @Override
    public User getUser() {
        System.out.println("UserMapperImpl实现类");
        return null;
    }
}
