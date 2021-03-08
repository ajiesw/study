package com.kuer.study;

import com.kuer.study.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理代理的是接口 注意点
        UserService service = (UserService) context.getBean("userService");
        service.add();
        service.delete();
    }
}
