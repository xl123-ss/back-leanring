package com.xxx.spring.ioc;

public class UserServiceImpl implements UserService{


    public UserDao userDao;
    public String namea;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(UserDao userDao, String namea) {
        this.userDao = userDao;
        this.namea = namea;
    }

    public UserServiceImpl() {
    }

    public void setNamea(String namea) {
        this.namea = namea;
    }

    @Override
    public void say() {
        userDao.say();
        System.out.println("service hello"+namea);
    }

}
