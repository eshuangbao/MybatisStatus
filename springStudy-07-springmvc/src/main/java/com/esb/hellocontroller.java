package com.esb;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-20 15:58
 **/

@org.springframework.stereotype.Controller
public class hellocontroller implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //封装对象，放在ModelAndView
        mv.addObject("msg","HellospringMvc");
        //封装要跳转的视图放在ModelAndView
        mv.setViewName("hello");//"/WEB-INF/jsp/hello.jsp"
        return mv;
    }
}
