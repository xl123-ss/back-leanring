package com.xxx.entity;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月06日 17:38
 */

public class User {
    public String username;
    public Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "username='" + username + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
