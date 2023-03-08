package com.xxx.entity;

import java.util.List;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月06日 19:03
 */
public class UserList {
    private String username;
    private Integer age;

    private List<Address> address;//这里使用List集合接收表单多个地址信息

    public List<Address> getAddress() {
        return address;
    }
    public void setAddress(List<Address> address) {
        this.address = address;
    }

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
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
