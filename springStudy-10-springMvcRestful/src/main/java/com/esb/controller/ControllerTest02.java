package com.esb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-21 10:06
 **/
@Controller
public class ControllerTest02 {

    @RequestMapping("/hello2")
    public String test1(Model model){
        model.addAttribute("msg","注解");
        return "hello";
    }
    @RequestMapping("/hello3")
    @ResponseBody
    public String test2(Model model){
        model.addAttribute("msg","注解");
        return "hello";
    }
}
