package com.xxx.spring.ioc.t05annotation;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("userDao.....save");
    }
}
