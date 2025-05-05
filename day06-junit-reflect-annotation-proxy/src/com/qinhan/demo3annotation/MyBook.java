package com.qinhan.demo3annotation;

// 自定义注解
public @interface MyBook {
    String name();
    int age() default 18;
    String[] address();
}
