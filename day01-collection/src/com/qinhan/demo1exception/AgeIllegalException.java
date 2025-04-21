package com.qinhan.demo1exception;

/**
 * 自定义编译时异常
 * 1.继承Exception类
 * 2.重写构造器
 * 3.哪里需要这个异常返回，哪里就throw这个异常
 */
public class AgeIllegalException extends Exception {
    public AgeIllegalException(){}

    public AgeIllegalException(String message){
        super(message);
    }
}
