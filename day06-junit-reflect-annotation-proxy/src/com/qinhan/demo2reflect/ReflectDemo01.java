package com.qinhan.demo2reflect;

public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握反射第一步操作：获取类的的Class对象。（获取类本身）
        // 1.获取类本身： 类.Class
        Class c1 = Student.class;
        System.out.println(c1);
        // 2.获取类本身： Class.forName(类的全名)
        Class c2 = Class.forName("com.qinhan.demo2reflect.Student");
        System.out.println(c2);

        System.out.println(c1==c2);
        // 3.获取类本身：对象.getClass()
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3);
    }
}
