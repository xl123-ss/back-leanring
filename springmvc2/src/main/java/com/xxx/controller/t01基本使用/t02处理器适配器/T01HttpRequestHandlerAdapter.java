package com.xxx.controller.t01基本使用.t02处理器适配器;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月04日 20:17
 */
public class T01HttpRequestHandlerAdapter implements HttpRequestHandler {
    //http://localhost:8080/springmvc2/hello
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.getWriter().write("Helle");
    }
}
