package com.qinhan.demo2genericity;

public class GenericDemo02 {
    public static void main(String[] args) {
        // 目标：学会自定义泛型类
        // 需求：模拟ArrayList集合自定义一个集合MyArrayList
        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("hello");
        myList.add("world");
        myList.add("java");
        System.out.println(myList.remove("hello"));
        System.out.println(myList);


    }
}
