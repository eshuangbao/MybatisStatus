package com.esb.service;

import org.springframework.stereotype.Component;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-16 16:36
 **/
@Component
public class userserviceimpl implements userservice {
    @Override
    public void add() {
        System.out.println("增加一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");

    }

    @Override
    public void update() {
        System.out.println("修改一个用户");

    }

    @Override
    public void select() {
        System.out.println("查询一个用户");

    }
}
