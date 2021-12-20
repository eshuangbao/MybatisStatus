package com.esb.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-08 10:24
 **/
public class peopler {
    @Resource
    private dao dao;
    @Autowired
    private cat cat;

    public  void mydao(){
        this.dao.jiao();
    }
    public void mycat(){
        this.cat.jiao();
    }

}
