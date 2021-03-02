package com.kuer;

import com.kuer.study.spring.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 对象现在都由Spring管理，要使用，直接从里面取出来就可以了
        Hello hello = (Hello) context.getBean("hello");
        hello.say();
    }
}
