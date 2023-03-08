package com.xxx.controller.t01基本使用.t02处理器适配器;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月04日 20:51
 */
@Controller
@RequestMapping("/t01/t02")
public class T04RequestMappingHandlerAdapter {
    //http://localhost:8080/springmvc2//t01/t02/hello
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("进入控制器的方法");
        //注意：这里返回的只是页面名称，不是完整的页面访问路径
        return "t01success";
    }
}
