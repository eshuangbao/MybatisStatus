package com.esb.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-16 16:47
 **/
@Component
public class AfterLog implements AfterReturningAdvice {
    /**
     * Callback after a given method successfully returned.
     *
     * @param returnValue the value returned by the method, if any
     * @param method      the method being invoked
     * @param args        the arguments to the method
     * @param target      the target of the method invocation. May be {@code null}.
     * @throws Throwable if this object wishes to abort the call.
     *                   Any exception thrown will be returned to the caller if it's
     *                   allowed by the method signature. Otherwise the exception
     *                   will be wrapped as a runtime exception.
     */
    @Override
    //returnValue :返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了，返回结果为"+returnValue);
    }
}
