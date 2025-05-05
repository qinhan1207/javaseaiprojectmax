package com.qinhan.demo3annotation;

@MyBook(name = "赵丽颖", age = 18, address = {"北京", "上海"})
@A("delete")
public class AnnotationDemo01 {
    @MyBook(name = "王菲", age = 50, address = {"香港", "上海"})
    public static void main(String[] args) {
        // 目标：自定义注解
    }
}
