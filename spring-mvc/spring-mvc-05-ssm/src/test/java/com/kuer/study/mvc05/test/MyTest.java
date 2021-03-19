package com.kuer.study.mvc05.test;

import com.kuer.study.mvc.ssm.pojo.User;
import com.kuer.study.mvc.ssm.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService bean = context.getBean(UserService.class);
        bean.getList(new User()).forEach(System.out::println);
    }
}
