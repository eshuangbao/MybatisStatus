package com.esb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-20 18:22
 **/
@Controller
@RequestMapping("/hello")
public class helloController {
    @RequestMapping("/h1")
    public  String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello,AnnotationspringMvc");
        return "hello";//被视图解析
    }
}
