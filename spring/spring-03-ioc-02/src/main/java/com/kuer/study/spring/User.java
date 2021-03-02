package com.kuer.study.spring;

import lombok.Data;

/**
 * @author kuer
 */
@Data
public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

    public User(){
        System.out.println("User的无参构造器");
    }
}
