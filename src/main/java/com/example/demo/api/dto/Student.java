package com.example.demo.api.dto;

import javax.validation.constraints.Min;

public class Student {

    @Min(5)
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}