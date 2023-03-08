package com.xxx.entity;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月06日 17:38
 */

public class User3 {
    @NotNull
//    @Pattern(regexp = "^([a-zA-Z]*[0-9_-]*$)", message = "只能包含字母、数字、下划线，且不能以数字或下划线开头")
    public String username;
    @NotNull
    @Range(min=0, max=150,message="年龄不在合法范围内")
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

    @Override
    public String toString() {
        return "User3{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
