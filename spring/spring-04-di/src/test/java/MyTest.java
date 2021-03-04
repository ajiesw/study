import com.kuer.study.spring.pojo.Student;
import com.kuer.study.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        User userP = context.getBean("user", User.class);
        User userC = context.getBean("user2", User.class);
        User userF = context.getBean("user3", User.class);
        System.out.println(userF);
        System.out.println(userC);
        System.out.println(userP);
    }
}
