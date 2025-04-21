package com.qinhan.demo4genericity;

import com.qinhan.demo3genericity.Student;

public class GenericDemo04 {
    public static void main(String[] args) {
        // 目标：学会定义泛型方法，搞清楚作用
        // 需求：打印任意数组的内容
        String[] names = {"java", "c++", "python", "js"};
        Student[] students = new Student[10];
        printArray(names);
        printArray(students);

        String max = getMax(names);
        Student max2 = getMax(students);
    }

    public static <T> void printArray(T[] t) {
    }

    public static <T> T getMax(T[] t) {
        return null;
    }
}
