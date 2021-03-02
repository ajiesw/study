package com.kuer.study.spring.pojo;

import lombok.Data;

/**
 * @author kuer
 */
@Data
public class Hello {

    private String name;

    public void say(){
        System.out.println("Hello" + name);
    }
}
