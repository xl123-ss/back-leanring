package com.xxx.controller.t08拦截器;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月10日 22:22
 */
@Controller
@RequestMapping("/t08")
public class T01拦截器 {

    /**
     * http://localhost:8080/springmvc2/t08/hello
     */
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("目标控制器-HelloController");
        return "t01success";
    }


    /**
     * http://localhost:8080/springmvc2/t08/hello2
     */
    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println("目标控制器-HelloController2");
        return "t01success";
    }
}
