package com.api.student.Entity;


import org.springframework.stereotype.Component;

@Component
public class Address {

    private String city;
    private String area;


    public Address(String city, String area) {
        this.city = city;
        this.area = area;
    }

    public Address() {
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
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
