package com.esb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-22 16:25
 **/
@Controller
public class hellocontroller {

    @RequestMapping("/H1")
    @ResponseBody
    public String hello(){
        return "OK";
    }
}
