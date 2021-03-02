package com.kuer.study.spring.pojo;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author kuer
 */
@Data
public class Student {

    private String name;

    private int age;

    private Address address;

    private String[] books;

    private List<String> hobbies;

    private Map<String, String> cards;

    private Set<String> games;

    private Properties info;

    private String wife;
}
