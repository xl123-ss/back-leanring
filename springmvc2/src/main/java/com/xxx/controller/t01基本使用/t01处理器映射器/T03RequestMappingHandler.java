package com.xxx.controller.t01基本使用.t01处理器映射器;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月04日 15:26
 */
@Controller
@RequestMapping("/t01/t01")
public class T03RequestMappingHandler {
    //http://localhost:8080/springmvc2//t01/t01/hello
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("进入控制器的方法");
        //注意：这里返回的只是页面名称，不是完整的页面访问路径
        return "t01success";
    }


}
