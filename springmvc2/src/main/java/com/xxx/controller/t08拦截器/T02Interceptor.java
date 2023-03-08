package com.xxx.controller.t08拦截器;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月10日 22:25
 */

/**
 * 自定义拦截器
 */
public class T02Interceptor implements HandlerInterceptor {

    /**
     * preHandle
     * 在控制器(目标)的方法之前执行
     * 返回值：控制afterCompletion方法是否被执行
     * true:执行
     * false:不执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("4.T02preHandle");
        return true;
    }

    /**
     * postHandle
     * 在控制器（目标）的方法成功执行完成之后执行
     * (注意，控制器方法不能失败)
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("5.T02方法执行完毕");
    }

    /**
     *afterCompletion
     * 在执行前面所有(拦截器和目标)的方法之后执行
     * (注意:不管控制器方法执行成功与否都会执行)
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("6.T02afterCompletion");
    }
}
