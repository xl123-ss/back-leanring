package com.xxx.controller.t05控制器返回值;

import com.xxx.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月09日 18:01
 */
@Controller
@RequestMapping("/t05")
public class T01控制器返回值 {

    /**
     * 普通字符串，代表页面名称，不是完整字符串，最后经过视图解析器
     * 优势：写法简单
     * 劣势：只能转发到视图解析器指定的目录
     * http://localhost:8080/springmvc2/t05/string
     *
     * @return
     */
    @RequestMapping("/string")
    public String string() {
        System.out.println("字符串");
        //这里返回页面名称，必须经过视图解析器解析的！！！
        return "t01success";
    }


    /**
     * 转发字符串
     * 转发字符串格式:
     * forword:完整页面路径 例如:forward:/img/1.jpg
     * 优势:更加灵活，可以转到本项目下的任何页面，可以传递request域对象数据
     * http://localhost:8080/springmvc2/t05/forward
     *
     * @return
     */
    @RequestMapping("/forward")
    public String forward() {
        System.out.println("字符串");
//        return "forward:/img/1.jpg";
        //调用其他方法 /代表，跟路基，不带会在当前路径下加上请求，会报错
        return "forward:/t05/string";
    }

    /**
     * 重定向字符串
     * 格式:
     * redirect:完整页面路径，例如: redirect:/img/1.jpg
     * 优势：可以重定向到项目内和项目外的页面
     * 劣势:不能传递request对象中的数据
     * http://localhost:8080/springmvc2/t05/redirect
     *
     * @return
     */
    @RequestMapping("/redirect")
    public String redirect() {
        System.out.println("字符串");
        return "redirect:http://www.baidu.com";
    }


    /**
     * void
     * 适用于文件下载
     * http://localhost:8080/springmvc2/t05/void
     *
     * @param response
     */
    @RequestMapping("/void")
    public void returnVoid(HttpServletResponse response) {
        System.out.println("void....");

        //模拟文件下载
        //1.读取需要下载的文件
        File file = new File("D:\\work\\java\\idea\\code\\test2\\springmvc2\\src\\main\\webapp\\img\\1.jpg");

        //2.构建文件输入流
        try (
                InputStream in = new FileInputStream(file);
                //3.获取文件输出流（从response对象获取）
                OutputStream out = response.getOutputStream()

        ) {
            //4.边读边写
            byte[] buf = new byte[1024];
            int len = 0;

            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }


    /**
     * void
     * 适用于文件下载
     * http://localhost:8080/springmvc2/t05/void2
     * 纯空，就什么也不返回
     *
     * @param response
     */
    @RequestMapping("/void2")
    public void returnVoid2(HttpServletResponse response) {
        System.out.println("void....");

    }

    /**
     * ModelANdView
     * 封装了Model数据和视图数据对象
     * http://localhost:8080/springmvc2/t05/mv
     *
     * @return
     */
    @RequestMapping("/mv")
    public ModelAndView mv() {
        ModelAndView mv = new ModelAndView();
        //设置模拟数据
        mv.addObject("name", "张三");
        //设置视图数据
        mv.setViewName("t01success");
        return mv;
    }

    /**
     返回Java对象
     http://localhost:8080/springmvc2/t05/javaBean
     单纯返回Java对象，是没有反应的，需要转换成json
     * @return
     */
    @RequestMapping("/javaBean")
    @ResponseBody
    public User javaBean(){
        User user = new User();
        user.setUsername("张三");
        user.setAge(20);
        return user;
    }

    /**
     返回Map对象
     http://localhost:8080/springmvc2/t05/map
     * @return
     */
    @RequestMapping("/map")
    @ResponseBody
    public Map map(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",20);
        ArrayList<Object> list = new ArrayList<>();
        list.add(map);
        map = new HashMap<>();
        map.put("name","李四");
        map.put("age",30);
        list.add(map);

        map = new HashMap<>();
        map.put("name","王五");
        map.put("age",130);
        map.put("数据集合",list);
        return map;
    }


    /**
     返回List对象
     http://localhost:8080/springmvc2/t05/list
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List list(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",20);

        ArrayList<Object> list = new ArrayList<>();
        list.add(map);
        map = new HashMap<>();
        map.put("name","李四");
        map.put("age",30);
        list.add(map);
        return list;
    }



}
