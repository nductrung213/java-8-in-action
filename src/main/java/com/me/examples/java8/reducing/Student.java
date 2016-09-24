/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.examples.java8.reducing;

/**
 *
 * @author trung
 */
public class Student {

    private String name;
    private Integer age;
    private String className;

    public Student(String name, Integer age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }
}
