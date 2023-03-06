package com.xxx.spring.ioc;

public class UserDaoImpl implements UserDao{

    @Override
    public void say() {
        System.out.println("dao world");
    }
}
