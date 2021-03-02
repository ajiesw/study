package com.kuer.study.spring.service;

import com.kuer.study.spring.mapper.UserMapper;
import com.kuer.study.spring.mapper.UserMapperImpl;
import com.kuer.study.spring.pojo.User;

/**
 * @author wangkaijie
 * @ClassName UserServerImpl.java
 * @createTime 2021年03月02日 16:21:00
 */
public class UserServerImpl implements IUserService{

    UserMapper userMapper = new UserMapperImpl();

    UserMapper userMapper1;

    /**
     * 利用set进行动态实现
     * @param userMapper1
     */
    public void setUserMapper1(UserMapper userMapper1) {
        this.userMapper1 = userMapper1;
    }

    /**
     * test
     *
     * @return
     */
    @Override
    public User getUser() {
        return userMapper.getUser();
    }
}
