package com.esb.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-21 10:00
 **/
//缺点，一个接口就需要一个写一个controller实现类
@org.springframework.stereotype.Controller("/hello")
public class ControllerTest01 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("msg","鄂双宝");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
