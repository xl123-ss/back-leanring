package com.xxx.controller.t06restful风格;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月09日 20:39
 */
@Controller
@RequestMapping("/t06")
public class T01restful风格 {
    /**
     * 增加
     * http://localhost:8080/springmvc2/pages/t060view.jsp
     */
    @RequestMapping(value = "/rest",method= RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("增加...");
        return "t01success";
    }

    /**
     * 查询
     */
    @RequestMapping(value = "/rest",method= RequestMethod.GET)
    @ResponseBody
    public String find(){
        System.out.println("查询...");
        return "t01success";
    }


    /**
     * 修改
     * @PathVariable 这个注解获取参数时，并不可少
     */
    @RequestMapping(value = "/rest/{id}",method= RequestMethod.PUT)
    @ResponseBody
    public String update(@PathVariable("id") Integer id){
        System.out.println("修改...id="+id);
        return "t01success";
    }


    /**
     * 删除
     */
    @RequestMapping(value = "/rest/{id}",method= RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("删除...id="+id);
        return "t01success";
    }
}
