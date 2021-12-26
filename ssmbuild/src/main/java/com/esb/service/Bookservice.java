package com.esb.service;

import com.esb.pojo.Books;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-21 13:02
 **/
public interface Bookservice {
    //增加
    int addbook(Books books);
    //删除
    int deletebook( int id );
    //更新
    int updatebook(int id);
    //查询
    Books querybookByID(int id);
    //查询全部
    List<Books> queryAllbook();
}
