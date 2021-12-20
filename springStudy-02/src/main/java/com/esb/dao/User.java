package com.esb.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-08 11:07
 **/
/*这个注解表示该类会被当做组件扫描到spring中
* 等价于<bean id ="User" class ="com.esb.dao.User"/>*/
@Component(value = "esb")
public class User {
    /*相当于         <property name="name" value="鄂双宝"/>
     */
    @Value("鄂双宝")
    public  String name;
    @Value("鄂双宝2")
    public void setName(String name) {
        this.name = name;
    }

    public  void myname(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        };
        Proxy proxy;

    }
}
