package com.kuer;

import com.kuer.study.spring.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        userService.getUser();
    }
}
