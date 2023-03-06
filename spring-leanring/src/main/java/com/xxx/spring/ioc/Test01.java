package com.xxx.spring.ioc;

import com.xxx.spring.ioc.t01entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {


    @Test
    public void t01初步使用(){
        //1.初始化spring ioc容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从ioc容器取出对象
        //        CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
        //如果xml不起id，则就是全限定名
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.say();
    }


    @Test
    public void t02依赖注入(){
        //1.初始化spring ioc容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从ioc容器取出对象
        //        CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
        //如果xml不起id，则就是全限定名
        UserService userService = (UserService) context.getBean("userService");
        userService.say();
    }

    @Test
    public void t03测试(){
        //1.初始化spring ioc容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从ioc容器取出对象
        //        CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
        //如果xml不起id，则就是全限定名
        Cat cat = (Cat) context.getBean("cat");
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(cat);
        System.out.println(dog);

    }

    @Test
    public void t04测试(){
        //1.初始化spring ioc容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从ioc容器取出对象
        //        CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
        //如果xml不起id，则就是全限定名
        Book book1 =  context.getBean("book1",Book.class);
        Book book2 =  context.getBean("book2",Book.class);
//        System.out.println(book1);
//        System.out.println(book2);

    }

    @Test
    public void t05注入(){
        //1.初始化spring ioc容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 =  context.getBean("person1", Person.class);
        Person person2 =  context.getBean("person2", Person.class);
        person1.dress();
        person2.dress();
    }

    @Test
    public void t06list(){
        //1.初始化spring ioc容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SchoolBag schoolbag =  context.getBean("schoolbag", SchoolBag.class);
//        schoolbag.getPens().forEach(System.out::println);
        System.out.println(schoolbag);

    }
}
