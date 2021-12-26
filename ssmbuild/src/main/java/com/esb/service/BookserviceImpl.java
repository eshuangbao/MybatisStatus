package com.esb.service;

import com.esb.dao.BookMapper;
import com.esb.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-21 13:02
 **/
public class BookserviceImpl implements Bookservice {

    private BookMapper bookMapper;
    public void setBookMapper(com.esb.dao.BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
    @Override
    public int addbook(Books books) {
        return bookMapper.addbook(books);
    }

    @Override
    public int deletebook(int id) {
        return bookMapper.deletebook(id);
    }

    @Override
    public int updatebook(int id) {
        return bookMapper.updatebook(id);
    }

    @Override
    public Books querybookByID(int id) {
        return bookMapper.querybookByID(id);
    }

    @Override
    public List<Books> queryAllbook() {
        return bookMapper.queryAllbook();
    }


}
