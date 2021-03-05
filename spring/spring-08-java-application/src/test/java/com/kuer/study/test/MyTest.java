package com.kuer.study.test;

import com.kuer.study.spring.config.MyConfig;
import com.kuer.study.spring.config.MyConfig2;
import com.kuer.study.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangkaijie
 * @ClassName MyTest.java
 * @createTime 2021年03月05日 15:49:00
 */
public class MyTest {
    @Test
    public void test(){
        // 使用java配置文件时，只能通过AnnotationConfigApplicationContext来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(context.getBean("user", User.class));
        System.out.println(context.getBean("getUser", User.class));
    }
    @Test
    public void test2(){
        // 使用java配置文件时，只能通过AnnotationConfigApplicationContext来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
        System.out.println(context.getBean("user", User.class));
        System.out.println(context.getBean("getUser", User.class));
    }
}
