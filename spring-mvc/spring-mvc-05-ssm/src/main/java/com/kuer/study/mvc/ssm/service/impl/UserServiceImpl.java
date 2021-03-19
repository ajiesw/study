package com.kuer.study.mvc.ssm.service.impl;

import com.kuer.study.mvc.ssm.mapper.UserMapper;
import com.kuer.study.mvc.ssm.pojo.User;
import com.kuer.study.mvc.ssm.service.UserService;

import java.util.List;

/**
 * @author kuer
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getList(User user) {
        return userMapper.getList(user);
    }
}
