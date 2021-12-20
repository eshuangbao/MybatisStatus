package com.esb.diy;


import org.springframework.stereotype.Component;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-16 17:25
 **/
@Component
public class DiyPointCut {

    public void befor(){
        System.out.println("=========方法执行前=============");
    }
    public void after(){
        System.out.println("=========方法执行后=============");

    }

}
