package com.xxx.spring.ioc.t01entity;

public class Person {
    private String name;
    private Clothes clothes;

    public void dress(){
        String res = name+"爱穿"+clothes.getColor()+clothes.getStyle();
        System.out.println(res);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public Person(String name, Clothes clothes) {
        this.name = name;
        this.clothes = clothes;
    }


}
