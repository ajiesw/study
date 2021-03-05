package com.kuer.study.spring.test;

import com.kuer.study.spring.pojo.Human;
import com.kuer.study.spring.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangkaijie
 * @ClassName MyTest.java
 * @createTime 2021年03月05日 10:30:00
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People people = context.getBean(People.class);
        System.out.println(people);
    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Human human = context.getBean(Human.class);
        System.out.println(human);
    }
}
