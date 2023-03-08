package com.xxx.controller.t09异常处理;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月11日 16:47
 */

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义异常处理类
 */
@ControllerAdvice
public class MyCustomerException2 {

    @ExceptionHandler
    public ModelAndView handleError(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("t090error");
        mv.addObject("errorMsg",e.getMessage());
        return mv;
    }

}
