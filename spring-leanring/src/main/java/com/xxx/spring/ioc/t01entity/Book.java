package com.xxx.spring.ioc.t01entity;

public class Book {
    private Integer id;
    private String name;
    private Float price;

    public Book(Integer id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
//        System.out.println("有参构造"+this);
    }

    public Book() {
//        System.out.println("无参构造"+this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
