package com.esb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-22 16:46
 **/
@Controller
@RequestMapping("/user")
public class Logincontroller {
    @RequestMapping("/login")
    public String loging(HttpSession session ,String username, String password){
        session.setAttribute("username",username);
        if("123456".equals(password)){
        }
        return "main";
    }

    @RequestMapping("/main")
    public String main(HttpSession session ,String username, String password){
        return "main";
    }
    @RequestMapping("/gologin")
    public String gologin(HttpSession session ,String username, String password){
        return "login";
    }

    @RequestMapping("/goout")
    public String goout(HttpSession session ,String username, String password){
        session.removeAttribute("username");
        return "login";
    }
}
