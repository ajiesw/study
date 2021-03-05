package com.kuer.study.spring.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wangkaijie
 * @ClassName User.java
 * @createTime 2021年03月05日 14:52:00
 */
// @Component 等价于 <bean id="user" class="com.kuer.study.spring.pojo.User"/>
@Component
@ToString
@Scope("singleton")
//@Scope("prototype")
public class User {
    // @Value("kuer")等价于<property name="user" value="kuer"/>
//    @Value("kuer")
    private String user;

    public String getUser() {
        return user;
    }
    @Value("kuer")
    public void setUser(String user) {
        this.user = user;
    }
}
