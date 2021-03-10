package com.kuer.study.spring.config;


import com.kuer.study.spring.mapper.SpringUserMapper1;
import com.kuer.study.spring.mapper.impl.SpringUserMapper1Impl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.managed.ManagedTransactionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.config.JtaTransactionManagerFactoryBean;
import org.springframework.transaction.jta.JtaTransactionManager;

import java.io.IOException;

/**
 * @EnableTransactionManagement 开启spring事务
 * @author kuer
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("com.kuer.study.spring.pojo")
public class MyConfigTrans {

    /**
     * 数据源
     * @return
     */
    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?useSSL=true&userUnicode=ture&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
        dataSource.setUsername("root");
        dataSource.setPassword("root123");
        return dataSource;
    }

    /**
     * SqlSessionFactoryBean
     * @return
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setTypeAliasesPackage("com.kuer.study.spring.pojo");
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactory.setMapperLocations(resolver.getResources("classpath:mapper/*Mapper*.xml"));
        sqlSessionFactory.setConfiguration(new org.apache.ibatis.session.Configuration(){{
            setMapUnderscoreToCamelCase(true);
        }});
        return sqlSessionFactory.getObject();
    }

    /**
     * SqlSessionTemplate 就是 SqlSession
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionTemplate sqlSessionTemplate() throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory());
    }

    @Bean
    public DataSourceTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SpringUserMapper1 userMapper() throws Exception {
        SpringUserMapper1Impl userMapper = new SpringUserMapper1Impl();
        userMapper.setSqlSessionFactory(sqlSessionFactory());
        return userMapper;
    }
}
