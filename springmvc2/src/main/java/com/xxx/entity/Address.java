package com.xxx.entity;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月06日 18:06
 */
public class Address {
    public String province;
    public String city;

    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
