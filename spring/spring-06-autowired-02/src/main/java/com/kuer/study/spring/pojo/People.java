package com.kuer.study.spring.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author kuer
 */
@Data
public class People {
    @Autowired
    private Cat cat;

    @Autowired
    @Qualifier(value = "dog1")
    private Dog dog;

    private String name;
}
