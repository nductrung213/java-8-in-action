/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.examples.java8.reducing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 *
 * @author trung
 */
public class ReducingDemo {

    public static void main(String[] args) {
        Student s1 = new Student("Shyam", 22, "A");
        Student s2 = new Student("Ram", 23, "A");
        Student s3 = new Student("Mohan", 22, "B");
        Student s4 = new Student(null, 21, "B");

        List<Student> classes = Arrays.asList(s1, s2, s3, s4);
        Map<String, Optional<Student>> eldestPersonInClass = classes.stream()
                .collect(Collectors.groupingBy(Student::getClassName,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Student::getAge)))));
        eldestPersonInClass.forEach((k, v)
                -> System.out.println("Class:" + k + " Age:" + v.get().getAge() + " Name:" + v.get().getName()));
    }
}
