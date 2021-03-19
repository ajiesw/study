package com.kuer.study.mvc.ssm.service;

import com.kuer.study.mvc.ssm.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * getList
     * @param user
     * @return
     */
    List<User> getList(User user);
}
