package com.kuer.study.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Aspect 标注这个类是切面
 * 使用注解实现AOP
 * @author kuer
 */
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.kuer.study.service.impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("===方法执行前");
    }

    @After("execution(* com.kuer.study.service.impl.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("===方法执行后");
    }
    @Around("execution(* com.kuer.study.service.impl.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("===环绕前");
        // 获得签名
        Signature signature = joinPoint.getSignature();
        // 签名就是执行这个的方法信息
        System.out.println(signature);
        Object proceed = joinPoint.proceed();

        System.out.println("===环绕后");
    }
}
