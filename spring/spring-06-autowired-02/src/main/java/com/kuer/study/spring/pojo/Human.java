package com.kuer.study.spring.pojo;

import lombok.Data;

import javax.annotation.Resource;

/**
 * @author wangkaijie
 * @ClassName Hauman.java
 * @createTime 2021年03月05日 13:53:00
 */
@Data
public class Human {

    @Resource(name = "dog1")
    private Dog dog;

    @Resource
    private Cat cat;
}
