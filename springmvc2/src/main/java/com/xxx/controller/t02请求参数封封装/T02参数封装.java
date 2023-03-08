package com.xxx.controller.t02请求参数封封装;

import com.xxx.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月06日 16:32
 */
@Controller
@RequestMapping("/t02")
public class T02参数封装 {

    /**
     基本类型
     http://localhost:8080/springmvc2/pages/t02base.jsp
     */
    @RequestMapping("/base")
    @ResponseBody
    public String base(String username,Integer age){
        System.out.println("用户名："+username);
        System.out.println("年龄："+age);
        return username+":"+age;
    }


    /**
     RequestMapping
     http://localhost:8080/springmvc2/pages/t021requestMapping.jsp
     */
    @RequestMapping("/requestMapping")
    @ResponseBody
    public String requestMapping(@RequestParam("username") String name, @RequestParam("age") Integer age2){
        System.out.println("用户名："+name);
        System.out.println("年龄："+age2);
        return name+":"+age2;
    }

    /**
     JavaBean类型封装
     http://localhost:8080/springmvc2/pages/t022javaBean.jsp
     */
    @RequestMapping("/javaBean")
    @ResponseBody
    public String javaBean(User user,String username){
        System.out.println("用户名："+user.getUsername());
        System.out.println("年龄："+user.getAge());
        return user.getUsername()+":"+user.getAge();
    }


    /**
     JavaBean类型中含有包装类
     http://localhost:8080/springmvc2/pages/t023javaBean.jsp
     */
    @RequestMapping("/javaBean2")
    public String javaBean2(User2 user, Model model){
        System.out.println("用户名："+user.getUsername());
        System.out.println("年龄："+user.getAge());
        System.out.println("年龄："+user.getAddress().province);
        System.out.println("年龄："+user.getAddress().city);
        model.addAttribute("name",user.getUsername());
        model.addAttribute("age",user.getAge());
        model.addAttribute("省份",user.getAddress().province);
        model.addAttribute("省份",user.getAddress().city);
        return "t02test";
//        return user.getUsername()+":"+user.getAge()+user.getAddress().province+":"+user.getAddress().city;
    }

    /**
     数组
     http://localhost:8080/springmvc2/pages/t024array.jsp
     http://localhost:8080/springmvc2/t02/array?names=1&names=2
     */
    @RequestMapping("/array")
    @ResponseBody
    public String array(String[] names){
        String res = "";
        for (String name : names) {
            res = res+name;
        }
        return res;
    }

    /**
     List封装
     http://localhost:8080/springmvc2/pages/t025list.jsp
     */
    @RequestMapping("/list")
    @ResponseBody
    public String list(UserList user){
        System.out.println("用户名："+user.getUsername());
        System.out.println("年龄："+user.getAge());
        //遍历所有地址信息
        for(Address addr:user.getAddress()){
            System.out.println(addr);
        }
        return "t01success";
    }

    /**
     Map封装
     http://localhost:8080/springmvc2/pages/t026map.jsp
     */
    @RequestMapping("/map")
    @ResponseBody
    public String map(UserMap user){
        System.out.println("用户名："+user.getUsername());
        System.out.println("年龄："+user.getAge());
        //遍历所有地址信息
        user.getAddress().forEach((k,v)->{
            System.out.println(k+"::"+v);
        });
        return "t01success";
    }

    /**
     Json转换
     http://localhost:8080/springmvc2/pages/t027json.jsp
     * 1) 接收前台传递json字符串格式 @RequestBody: 把json字符串转为Java对象,如果不加这个注解连字符串都获取
     * 不到
     * 2) 后台Java对象转换json字符串： @ResponseBody
     */
//    @RequestMapping("/json")
//    @ResponseBody
//    public String jsonString(@RequestBody  String user){
//        System.out.println("前端发送的数据："+user);
//        return "1111";
//    }

    /**
     Json转换成Java对象
     http://localhost:8080/springmvc2/pages/t027json.jsp
     */
//    @RequestMapping("/json")
//    @ResponseBody
//    public User jsonBean(@RequestBody User user1){
//
//        System.out.println("前端发送的数据："+user1);
//        //后台返回json字符串给前端
//        User user = new User();
//        user.setAge(12);
//        user.setUsername("小苍");
//        user.setAge(20);
//        return user;
//    }


    /**
     Json转换成map对象
     http://localhost:8080/springmvc2/pages/t027json.jsp
     */
    @RequestMapping("/json")
    @ResponseBody
    public Map<Object, Object> jsonMap(@RequestBody Map user1){
        System.out.println("前端发送的数据："+user1);
        //后台返回json字符串给前端
        HashMap<Object, Object> user = new HashMap<>();
        user.put("age",12);
        user.put("username","小张");
        return user;
    }

    /**
     String转换成Date对象
     http://localhost:8080/springmvc2/pages/t028date.jsp
     */
//    @RequestMapping("/date")
//    @ResponseBody
//    public String date(@RequestParam  LocalDateTime birthday){
//        System.out.println(birthday);
//        return "aaaaaa";
//    }


    /**
     String转换成Date对象
     http://localhost:8080/springmvc2/pages/t028date.jsp
     */
    @RequestMapping("/date")
    @ResponseBody
    public String date2(Date birthday){
        System.out.println(birthday);
        return "aaaaaa";
    }

    /**
     String转换成Date对象
     http://localhost:8080/springmvc2/pages/t028date.jsp
     */
//    @RequestMapping("/date")
//    @ResponseBody
//    public String date(@RequestParam  LocalDateTime birthday){
//        System.out.println(birthday);
//        return "aaaaaa";
//    }


    /**
     ModelAttribute
     */
//    @ModelAttribute
//    public void myModel(Model model){
//        model.addAttribute("name","bbbb");
//    }

    /**
     ModelAttribute
     带参数
     */
//    @ModelAttribute("name")
//    public String myModel带参数(String name){
//        return "aaaaa";
//    }


    //  http://localhost:8080/springmvc2/t02/model?name=1
//    @RequestMapping(value = "/model")
//    public String model() {
//        return "t01success";
//    }


//    //应用在方法的参数行
//    @RequestMapping(value = "/model")
//    public String model(@ModelAttribute("name") String name) {
//        System.out.println("name="+name);
//        return "t01success";
//    }

    //@ModelAttribute，@RequestMapping同时放在方法上
    //  http://localhost:8080/springmvc2/t02/t01success?name=1
    @RequestMapping(value = "/t01success")
    @ModelAttribute("name")
    public String model(@RequestParam(required = false) String name) {
        return name;
    }





}
