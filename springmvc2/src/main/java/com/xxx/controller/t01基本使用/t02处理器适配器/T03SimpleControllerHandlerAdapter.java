package com.xxx.controller.t01基本使用.t02处理器适配器;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月04日 20:51
 */
public class T03SimpleControllerHandlerAdapter implements Controller {
    //http://localhost:8080/springmvc2/hello
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("Hello World");
        return null;
    }
}
