package com.kuer.study.spring.config;

import com.kuer.study.spring.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangkaijie
 * @ClassName MyConfig.java
 * @createTime 2021年03月05日 15:46:00
 */
// 也会被Spring容器托管，注册到容器中，本身@Configuration也是@Component
@Configuration
// @ComponentScan包扫描路径
@ComponentScan("com.kuer.study.spring")
public class MyConfig {
    /**
    * @Bean： 注册一个bean，就相当一个bean标签
     * 方法名相当于bean标签中的id属性
     * 返回值类型相当与bean标签的class属性
     * 返回值就是要注入到bean的对象 对象的属性以@Value为准，如果没有配置属性值则以返回的对象为准
     * 如果即在配置文件中注入且方法名为类名首字母小写，又在bean类上加@Component注解会注册两个bean
     * @Component注解的生成的bean不会执行@Bean的方法
    * */
    @Bean
    public User getUser(){
        return new User("wkj");
    }
}
