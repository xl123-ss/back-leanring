package com.xxx.controller.t02请求参数封封装;

import com.sun.deploy.net.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月06日 15:16
 */
@Controller
@RequestMapping("/t02")
public class T01RequestMapping {
    /**
     value属性,可省略
     http://localhost:8080/springmvc2/t02/value
     */
    @RequestMapping(value = "/value")
    public void value(HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello value");
    }

    /**
     method
     http://localhost:8080/springmvc2/t02/method
     */
    @RequestMapping(value = "/method",method = RequestMethod.POST)
    public void method(HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello method");
    }

    /**
     consumes
     produces
     http://localhost:8080/springmvc2/t02/consume
     consumes = "application/json"
     produces = "application/json"
     */
    @RequestMapping(value = "/consume", consumes = "application/vvvv",produces = "application/aaaa")
    public void consumes(HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello method");
    }

    /**
     produces
     http://localhost:8080/springmvc2/t02/consume
     produces = "application/json"
     */
    @RequestMapping(value = "/produce", consumes = "application/vvvv",produces = "application/aaaa")
    public void produces(HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello method");
    }

    /**
     param
     http://localhost:8080/springmvc2/t02/param?id=10
     */
    @RequestMapping(value = "/param",params = "id=1")
    public void param(HttpServletResponse response,String id) throws IOException {
        response.getWriter().write("Hello method"+id);
    }

    /**
     http://localhost:8080/springmvc2/t02/headers
     */
    @RequestMapping(value = "/headers",headers = "id=1")
    public void headers(HttpServletRequest request,HttpServletResponse response,String id) throws IOException {
        response.getWriter().write("Hello method"+id);
    }

}
