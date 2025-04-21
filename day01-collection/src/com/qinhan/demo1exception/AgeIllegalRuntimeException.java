package com.qinhan.demo1exception;

/**
 * 自定义运行时异常
 * 1.继承RuntimeException类
 * 2.重写RuntimeException构造器
 * 3.哪里需要这个异常返回，哪里就throw这个异常
 */
public class AgeIllegalRuntimeException extends RuntimeException {
    public AgeIllegalRuntimeException(){}

    public AgeIllegalRuntimeException(String message){
        super(message);
    }
}
