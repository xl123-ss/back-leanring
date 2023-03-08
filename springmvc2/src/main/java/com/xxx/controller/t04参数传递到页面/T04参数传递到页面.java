package com.xxx.controller.t04参数传递到页面;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月08日 19:18
 */
@Controller
@RequestMapping("/t04")
public class T04参数传递到页面 {

    /**
     model
     http://localhost:8080/springmvc2/t04/model
     */
    @RequestMapping("/model")
    public String t01model(Model model){
        model.addAttribute("model","model测试");
        return "t040view";
    }

    /**
     model
     http://localhost:8080/springmvc2/t04/modelMap
     */
    @RequestMapping("/modelMap")
    public String t02modelMap(ModelMap modelMap){
        modelMap.addAttribute("modelMap","modelMap测试");
        return "t040view";
    }

    /**
     map
     http://localhost:8080/springmvc2/t04/map
     */
    @RequestMapping("/map")
    public String t01map(Map map){
        map.put("map","map测试");
        return "t040view";
    }
}
