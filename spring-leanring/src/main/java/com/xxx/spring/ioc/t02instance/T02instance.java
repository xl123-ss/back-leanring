package com.xxx.spring.ioc.t02instance;

import com.xxx.spring.ioc.t02instance.t01constructor.Bean1;
import com.xxx.spring.ioc.t02instance.t03factory.Bean3;
import com.xxx.spring.ioc.t02instance.t02static_factory.Bean2;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T02instance {

    @Test
    public void t01构造器构造(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("t02instance.xml");
        Bean1 bean =  context.getBean("bean1", Bean1.class);
        System.out.println(bean);
    }

    @Test
    public void t02静态工厂方法(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("t02instance.xml");
        Bean2 bean =  context.getBean("bean2", Bean2.class);
        System.out.println(bean);
    }

    @Test
    public void t03实例工厂方法(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("t02instance.xml");
        Bean3 bean =  context.getBean("bean3", Bean3.class);
        System.out.println(bean);
    }
}
