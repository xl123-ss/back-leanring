package com.xxx.spring.ioc.t01entity;

import java.util.List;
import java.util.Map;

public class SchoolBag {
    private String color;
    private List<Pen> pens;
    private Map pens2;
    private List<Map> pens3;

    public List<Map> getPens3() {
        return pens3;
    }

    public void setPens3(List<Map> pens3) {
        this.pens3 = pens3;
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "color='" + color + '\'' +
                ", pens=" + pens +
                ", pens2=" + pens2 +
                ", pens3=" + pens3 +
                '}';
    }

    public Map getPens2() {
        return pens2;
    }

    public void setPens2(Map pens2) {
        this.pens2 = pens2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Pen> getPens() {
        return pens;
    }

    public void setPens(List<Pen> pens) {
        this.pens = pens;
    }
}
