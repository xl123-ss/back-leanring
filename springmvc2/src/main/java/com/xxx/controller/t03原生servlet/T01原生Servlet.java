package com.xxx.controller.t03原生servlet;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Map;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月07日 22:51
 */
@Controller
@SessionAttributes
@RequestMapping("t03")
public class T01原生Servlet {


    /**
     * 原生请求
     * http://localhost:8080/springmvc2/t03/hello
     */
    @RequestMapping("/hello")
    public void t01原生测试(HttpServletRequest request,
                        HttpServletResponse response,
                        HttpSession session) throws IOException {
        request.setAttribute("request", "request");
        session.setAttribute("session", "session");
        String contextPath = request.getContextPath();

        response.sendRedirect(contextPath + "/pages/t01success.jsp");
    }

    /**
     * header
     * http://localhost:8080/springmvc2/pages/t030header.jsp
     */
    @RequestMapping("/header")
    public String save(@RequestHeader("host") String host,
                       @RequestHeader("accept") String accept,
                       @RequestHeader Map map) {
        System.out.println("host---" + host);
        System.out.println("accept---" + accept);
        return "t01success";
    }

    /**
     * cookie
     * http://localhost:8080/springmvc2/pages/t031cookie.jsp
     */
    @RequestMapping("/cookie")
    public String t03cookie(@CookieValue("JSESSIONID") Cookie sessionId) {
        System.out.println("JSESSIONID---" + sessionId);
        return "t01success";
    }

    /**
     * session
     *
     * @SessionAttributes注解只能运行在类上，代表所有的消息都放入session http://localhost:8080/springmvc2/t03/session
     */
    @RequestMapping(value = "/session")
    public String t04session(Model model) {
        model.addAttribute("name", "session测试");
        return "t032session";
    }

    /**
     * 直接获取session
     * http://localhost:8080/springmvc2/t03/session2
     */
    @RequestMapping(value = "/session2")
    public String t04session2(HttpSession session) {
        session.setAttribute("name", "session测试");
        return "t032session";
    }


    /**
     * 从HttpServletRequest中获取session
     * http://localhost:8080/springmvc2/t03/session3
     */
    @RequestMapping(value = "/session3")
    public String t04session3(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("name", "session测试");
        return "t032session";
    }


    /**
     * 从HttpServletRequest中获取context
     * http://localhost:8080/springmvc2/t03/application
     */
    @RequestMapping(value = "/application")
    public String t05application(HttpServletRequest request) {
        ServletContext context = request.getServletContext();
        context.setAttribute("name", "session测试");
        return "t032session";
    }
}
