package com.esb.dao;

import com.esb.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

public interface BookMapper {
    //增加
    int addbook(Books books);
    //删除
    int deletebook(@Param("bookid") int id );
    //更新
    int updatebook(int id);
    //查询
    Books querybookByID(@Param("bookid") int id);
    //查询全部
    List<Books> queryAllbook();
}
