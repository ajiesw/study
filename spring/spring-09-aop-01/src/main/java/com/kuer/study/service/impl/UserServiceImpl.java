package com.kuer.study.service.impl;

import com.kuer.study.service.UserService;

/**
 * @author kuer
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add方法调用");
    }

    @Override
    public void delete() {
        System.out.println("delete方法调用");
    }

    @Override
    public void update() {
        System.out.println("update方法调用");
    }

    @Override
    public void query() {
        System.out.println("query方法调用");
    }
}
