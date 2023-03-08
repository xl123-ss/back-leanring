package com.xxx.controller.t10表单数据验证;

import com.xxx.entity.User;
import com.xxx.entity.User3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月11日 18:57
 */

@Controller
@RequestMapping("/t10")
public class T01表单数据验证 {


    //http://localhost:8080/springmvc2/t10/login
    @GetMapping("/login")
    public String login(Model model) {
        //由于前端使用form标签，直接访问页面会报错,要进行controller跳转
        User user = new User();
        //前端存在user，后端必须也要
        model.addAttribute("user", user);
        return "t100login";
    }

    /**
     * http://localhost:8080/springmvc2/pages/t100login.jsp
     *
     * @Validated:启用验证器，BindingResult：绑定结果集
     */
    @PostMapping("/login")
    public String login(@Validated User user, BindingResult bindingResult) {
        //有异常，则就返回这个页面
        if (bindingResult.hasErrors()) {
            return "t100login";
        }
        //正确，返回成功页面
        return "t01success";
    }





    //http://localhost:8080/springmvc2/pages/t101login.jsp
    @RequestMapping("/hello")
    public String save(@Valid User3 user, BindingResult result, Model model){
        //如果表单数据验证有异常
        if(result.hasErrors()){
            //取出所有失败信息
            List<FieldError> fieldErrors = result.getFieldErrors();
            for(FieldError fieldError:fieldErrors){
                //把错误信息存入request域，传递到JSP页面显示
                model.addAttribute("ERROR_"+fieldError.getField(),fieldError.getDefaultMessage());
            }
            return "t101login";
        }

        System.out.println("User="+user);
        return "t01success";
    }


    /**
     * http://localhost:8080/springmvc2/pages/t102login.jsp
     *
     * @Validated:启用验证器，BindingResult：绑定结果集
     */
    @PostMapping("/login2")
    public String login2(String username) {
        System.out.println(username);
//        @Validated User user, BindingResult bindingResult,Model model
        //有异常，则就返回这个页面
        //如果表单数据验证有异常
//        if(bindingResult.hasErrors()){
//            //取出所有失败信息
//            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//            for(FieldError fieldError:fieldErrors){
//                //把错误信息存入request域，传递到JSP页面显示
//                model.addAttribute("ERROR_"+fieldError.getField(),fieldError.getDefaultMessage());
//            }
//            return "t102login";
//        }
//        //正确，返回成功页面
        return "t01success";
    }



}
