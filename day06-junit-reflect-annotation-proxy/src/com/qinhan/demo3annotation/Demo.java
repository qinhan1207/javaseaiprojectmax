package com.qinhan.demo3annotation;

@MyTest2(value = "刘亦菲",address = {"北京","上海","深圳"})
public class Demo {

    @MyTest2(value = "蔡徐坤",address = {"湖南","湖北"})
    public void go(){}
}
