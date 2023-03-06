package com.xxx.spring.ioc.t02instance.t03factory;

public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("Bean3工厂实例化中");
    }

    public Bean3 createBean3(){
        return new Bean3();
    }
}
