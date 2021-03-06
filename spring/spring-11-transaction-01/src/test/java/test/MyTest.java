package test;

import com.kuer.study.spring.mapper.SpringUserMapper;
import com.kuer.study.spring.mapper.impl.UserMapperImpl;
import com.kuer.study.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");

        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);
        List<User> users = userMapper.queryList();
        users.forEach(System.out::println);
    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
        SpringUserMapper userMapper = context.getBean("userMapper", SpringUserMapper.class);
        userMapper.addUser(new User(){{setName("add");setPassword("123");}});
    }
}
