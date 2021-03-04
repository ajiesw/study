package com.kuer.study.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangkaijie
 * @ClassName User.java
 * @createTime 2021年03月04日 16:10:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;

    private Integer age;

    private Address address;
}
