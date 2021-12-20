package com.esb.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-16 16:40
 **/
@Component
public class Log implements MethodBeforeAdvice {
    /*
     * 
     * @param method 要执行的目标对象的方法
    	 * @param args 参数
    	 * @param target 目标对象
     * @return 
     * @author eshuangbao
     * @creed: Talk is cheap,show me the code
     * @date  
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");

    }
}
