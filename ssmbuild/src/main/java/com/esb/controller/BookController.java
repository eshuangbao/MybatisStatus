package com.esb.controller;

import com.esb.pojo.Books;
import com.esb.service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-21 13:48
 **/
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookserviceImpl")
    private Bookservice bookservice;

    //查询全部的书籍，并返回一个数据展示页面
    @RequestMapping("/allbook")
    public  String list(Model model){
        List<Books> books = bookservice.queryAllbook();
        model.addAttribute("list",books);
        return "allbook";
    }
}
