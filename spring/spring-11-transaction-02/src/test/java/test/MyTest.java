package test;


import com.kuer.study.spring.config.MyConfigTrans;
import com.kuer.study.spring.mapper.SpringUserMapper1;
import com.kuer.study.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigTrans.class);
        SpringUserMapper1 userMapper = context.getBean("userMapper", SpringUserMapper1.class);
        userMapper.addUser(new User(){{setName("add");setPassword("123");}});
    }

}
