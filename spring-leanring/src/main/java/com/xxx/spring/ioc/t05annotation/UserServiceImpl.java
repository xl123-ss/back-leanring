package com.xxx.spring.ioc.t05annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserDao")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
        System.out.println("userService...save...");
    }
}
