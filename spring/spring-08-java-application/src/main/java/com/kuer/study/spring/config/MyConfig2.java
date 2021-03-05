package com.kuer.study.spring.config;

import com.kuer.study.spring.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wangkaijie
 * @ClassName MyConfig.java
 * @createTime 2021年03月05日 15:46:00
 */
// @Import(MyConfig.class)导入其他的配置类 相当于import标签 <import resource="applicationContext.xml"/>
@Configuration
@Import(MyConfig.class)
public class MyConfig2 {

}
