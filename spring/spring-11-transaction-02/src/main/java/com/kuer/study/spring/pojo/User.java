package com.kuer.study.spring.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author kuer
 */
@Data
@Component
public class User {
    private Integer id;

    private String name;

    private String password;
}
