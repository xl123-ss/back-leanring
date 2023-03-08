package com.xxx.controller.t01基本使用.t01处理器映射器;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
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

public class T01SimpleUrlHandler implements Controller {
    //http://localhost:8080/springmvc2/hello
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView("t01success");
        return mv;
    }
}
