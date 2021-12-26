package com.esb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-21 10:24
 **/
@Controller
public class RestfulController {
    //http://localhost:8080/add?a=1&b=1
    @RequestMapping("/add")
    public String test1(int a,int b,Model model){
        int c =a+b;
        model.addAttribute("msg","结果为："+c);
        return "hello";
    }
    //restful风格
    //http://localhost:8080/add2/1/2
    //@PathVariable 会将请求中用{}括起来的数据匹配到参数上
    @RequestMapping(value = "/add2/{a}/{b}",method = RequestMethod.GET)
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int c =a+b;
        model.addAttribute("msg","结果为："+c);
        return "hello";
    }

    //    上面色方式可以替换以下方式
    //http://localhost:8080/add3/3/3
    @GetMapping(value = "/add3/{a}/{b}")
    public String test3(@PathVariable int a, @PathVariable int b, Model model){
        int c =a+b;
        model.addAttribute("msg","结果为："+c);
        return "hello";
    }
}
