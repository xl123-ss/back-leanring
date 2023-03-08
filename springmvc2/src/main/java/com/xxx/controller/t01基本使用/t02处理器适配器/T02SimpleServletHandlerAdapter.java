package com.xxx.controller.t01基本使用.t02处理器适配器;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月04日 20:33
 */
public class T02SimpleServletHandlerAdapter extends HttpServlet {
    //http://localhost:8080/springmvc2/hello
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req,resp);
    }
}
