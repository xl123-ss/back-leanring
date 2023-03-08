package com.xxx.controller.t01基本使用.t01处理器映射器;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月04日 17:12
 */
@Component
public class T02BeanNameUrlHandler implements Controller {
    //http://localhost:8080/springmvc2/hello
    @RequestMapping("/hello")
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView("t01success");
//        FrameworkServlet
        return mv;
    }
}
