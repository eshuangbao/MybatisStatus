package com.esb.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-21 10:50
 **/
@Controller
public class ResultGoServletApi {
    @RequestMapping("/test1")
    public void test1(HttpServletRequest req, HttpServletResponse rsp) throws IOException {
        rsp.getWriter().println("hello,spring by servlet API");
    }
    @RequestMapping("/test2")//重定向
    public void test2(HttpServletRequest req, HttpServletResponse rsp) throws IOException {
       rsp.sendRedirect("index.jsp");
    }
    @RequestMapping("/test3")
    public void test3(HttpServletRequest req, HttpServletResponse rsp) throws IOException, ServletException {
        req.setAttribute("msg","servlet api");
        req.getRequestDispatcher("WEB-INF/jsp/hello.jsp").forward(req,rsp);
    }
    //以下方法需要没有视图解析器的情况下使用
    //springmvc 转发一
    @RequestMapping("/test4")
    public String test4(Model model)   {
        model.addAttribute("msg","springmvc api");
        return "WEB-INF/jsp/hello.jsp";
    }
    //springmvc 转发二
    @RequestMapping("/test5")
    public String test5(Model model)   {
        model.addAttribute("msg","springmvc api");
        return "forward:WEB-INF/jsp/hello.jsp";
    }

    //springmvc 重定向二
    @RequestMapping("/test6")
    public String test6(Model model)   {
        model.addAttribute("msg","springmvc api");
        return "redirect:index.jsp";
    }
    //如果有视图解析器，上面的就不能正常使用，因为返回的结果就会被拼接成不同的东西
    //springmvc 转发一
    @RequestMapping("/test7")
    public String test7(Model model)   {
        model.addAttribute("msg","springmvc api");
        return "hello";
    }
    //springmvc 重定向二
    @RequestMapping("/test8")
    public String test8(Model model)   {
        model.addAttribute("msg","springmvc api");
        return "redirect:index.jsp";
    }

}
