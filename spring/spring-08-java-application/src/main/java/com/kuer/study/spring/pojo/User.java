package com.kuer.study.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wangkaijie
 * @ClassName User.java
 * @createTime 2021年03月05日 15:45:00
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Value("kuer")
    private String user;
}
