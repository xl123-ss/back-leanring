package com.xxx.controller.t09异常处理;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月11日 16:38
 */
@Controller
@RequestMapping("/t09")
public class T01异常处理 {
    //http://localhost:8080/springmvc2/t09/hello
    @RequestMapping("/hello")
    public String hello() {
        //模拟异常
        int i = 100/0;
        return "t01success";
    }
}
