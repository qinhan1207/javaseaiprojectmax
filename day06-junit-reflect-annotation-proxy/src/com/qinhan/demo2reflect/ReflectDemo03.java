package com.qinhan.demo2reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        // 目标：反射的基本作用
        // 1.类的全部成分的获取
        // 2.可以破坏封装性
        // 3.可以绕过泛型的约束
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("令狐冲");
        list.add("东方不败");
        //list.add(9.9);

        Class c1 = list.getClass(); // c1 == ArrayList.class
        // 获取ArrayList的add方法
        Method add = c1.getDeclaredMethod("add", Object.class);
        // 触发list集合对象的add方法执行。
        add.invoke(list,8.0);   // 翻墙
        add.invoke(list,true);

        System.out.println(list);
    }
}
