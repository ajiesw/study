package com.kuer.study.test;

import com.kuer.study.mapper.SpringUserMapper;
import com.kuer.study.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = build.openSession();
        SpringUserMapper mapper = session.getMapper(SpringUserMapper.class);
        List<User> list = mapper.getList(new User());
        list.forEach(System.out::println);
    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
        SpringUserMapper userMapper = context.getBean("userMapper", SpringUserMapper.class);
        List<User> list = userMapper.getList(new User());
        list.forEach(System.out::println);
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
        SpringUserMapper userMapper = context.getBean("userMapper2", SpringUserMapper.class);
        List<User> list = userMapper.getList(new User());
        list.forEach(System.out::println);
    }
}
