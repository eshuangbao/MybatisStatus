package com.esb.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 使用注解方式使用aop
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-16 17:44
 **/
@Aspect//标注这个类是个切面
@Component
public class AnnotionPointCut {
    @Before("execution(* com.esb.service.userserviceimpl.*(..))")
    public void befor(){
        System.out.println("=========注解方法执行前=============");
    }
    @After("execution(* com.esb.service.userserviceimpl.*(..))")
    public void after(){
        System.out.println("=========注解方法执行后=============");

    }
    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.esb.service.userserviceimpl.*(..))")
    public void  arround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");

        Object proceed = joinPoint.proceed();

        System.out.println("执行后");

    }
    @AfterThrowing
    public void test(){

    }
}
