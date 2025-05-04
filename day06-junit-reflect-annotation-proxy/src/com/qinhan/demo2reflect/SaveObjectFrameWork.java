package com.qinhan.demo2reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjectFrameWork {
    // 保存任意对象的静态方法
    public static void saveObject(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("day06-junit-reflect-annotation-proxy/src/obj.txt",true));
        // obj 可能是狗、学生、老师
        // 只有反射可以知道对象有多少个字段
        // 1.获取Class对象
        Class c = obj.getClass();
        String simpleName = c.getSimpleName();
        ps.println("========" + simpleName + "========");
        // 2.获取Class对象的所有字段
        Field[] fields = c.getDeclaredFields();
        // 3.遍历字段
        for (Field field : fields) {
            // 4.获取字段的值
            // 4.1获取字段名称
            String fieldName = field.getName();
            // 4.2获取字段的值
            field.setAccessible(true); // 暴力反射
            Object fieldValue = field.get(obj) + "";
            // 5.打印到文件中
            ps.println(fieldName+"="+fieldValue);
        }
        ps.close();
    }
}
