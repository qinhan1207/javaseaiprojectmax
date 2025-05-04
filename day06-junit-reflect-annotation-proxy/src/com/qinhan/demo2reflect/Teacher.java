package com.qinhan.demo2reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private String name;
    private int age;
    private String hobby;
    private double salary;
    private String className;
    private char sex;
    private String phone;

}
