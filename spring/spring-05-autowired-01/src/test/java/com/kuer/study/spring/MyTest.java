package com.kuer.study.spring;

import com.kuer.study.spring.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People people1 = context.getBean("people1", People.class);
        people1.getCat().call();
        people1.getDog().call();
        People people2 = context.getBean("people1", People.class);
        people2.getDog().call();
        people2.getCat().call();
    }
}
