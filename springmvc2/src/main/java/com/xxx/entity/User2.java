package com.xxx.entity;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月06日 18:07
 */
public class User2 {
    private String username;
    private Integer age;
    private Address address;//封装地址信息
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
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