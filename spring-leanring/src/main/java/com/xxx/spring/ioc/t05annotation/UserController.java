package com.xxx.spring.ioc.t05annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void save(){
        userService.save();
        System.out.println("userController...save....");
    }
}
