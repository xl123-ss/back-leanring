package com.xxx.spring.ioc.t05annotation;

import com.xxx.spring.ioc.t04assemble.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethod {

    @Test
    public void t01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("t05annotation.xml");
        UserController userController =  context.getBean("userController",UserController.class);
        userController.save();


    }
}
