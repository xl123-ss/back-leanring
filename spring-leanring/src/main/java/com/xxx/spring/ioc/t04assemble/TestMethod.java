package com.xxx.spring.ioc.t04assemble;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethod {
    @Test
    public void t01xml配置(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("t04assemble.xml");
        User user1 =  context.getBean("user1", User.class);
        User user2 =  context.getBean("user2", User.class);
        System.out.println(user1);
        System.out.println(user2);
    }
}
