package com.xxx.spring.ioc.t03scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethod {
    @Test
    public void t01singleton(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("t03scopebean.xml");
        T01Scope scope1 =  context.getBean("scope", T01Scope.class);
        T01Scope scope2 =  context.getBean("scope", T01Scope.class);
        System.out.println(scope1);
        System.out.println(scope2);
    }

    @Test
    public void t01prototype(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("t03scopebean.xml");
        T01Scope scope1 =  context.getBean("scope2", T01Scope.class);
        T01Scope scope2 =  context.getBean("scope2", T01Scope.class);
        System.out.println(scope1);
        System.out.println(scope2);
    }
}
