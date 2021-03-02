import com.kuer.study.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println((User) context.getBean("user"));
        // 别名alias
        System.out.println((User) context.getBean("userArg0"));
        System.out.println((User) context.getBean("userArg1"));
        System.out.println((User) context.getBean("userArg2"));
        System.out.println((User) context.getBean("userArg3"));

        // 别名name user2 userB,ub;usb
        System.out.println((User) context.getBean("user2"));
        System.out.println((User) context.getBean("userB"));
        System.out.println((User) context.getBean("ub"));
        System.out.println((User) context.getBean("usb"));
    }
}
