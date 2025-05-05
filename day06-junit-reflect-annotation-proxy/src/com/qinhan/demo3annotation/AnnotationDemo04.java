package com.qinhan.demo3annotation;

import java.lang.reflect.Method;

public class AnnotationDemo04 {
    public static void main(String[] args) throws Exception{
        // 目标：搞清楚注解的应用场景：模拟Junit框架。有MyTest注解的方法就执行，没有就不执行

        AnnotationDemo04 at  = new AnnotationDemo04();

        // 1.获取类对象
        Class c = AnnotationDemo04.class;
        // 2.获取所有方法
        Method[] methods = c.getDeclaredMethods();
        // 3.遍历所有方法，有@MyTest注解就执行
        for (Method method : methods) {
            // 4.判断方法是否有@MyTest注解
            if (method.isAnnotationPresent(MyTest.class)){
                // 获取到这个方法的注解
                MyTest myTest = method.getDeclaredAnnotation(MyTest.class);
                int count = myTest.count();
                // 5.有就执行这个方法
                for (int i = 0; i < count; i++) {
                    method.invoke(at);
                }
            }
        }

    }

    @MyTest
    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }

    @MyTest(count = 5)
    public void test3() {
        System.out.println("test3");
    }

    public void test4() {
        System.out.println("test4");
    }

}
