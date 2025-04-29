package com.qinhan.demo8api;

public class Test2 {
    public static void main(String[] args) {
        // 目标：高效拼接字符串
        // + 拼接字符串内容，如果是大量拼接，效率极差！
        // String的对象是不可变变量：共享数据性能可以，但是修改数据性能差
        //String s = "";
        //for (int i = 0; i < 1000000; i++) {
        //    s += "abc";
        //}
        //System.out.println(s);

        // StringBuilder对象是可变内容的容器
        // 定义字符串可以使用String类型，但是操作字符串建议大家使用StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
        // StringBuilder 只是拼接字符串的手段，结果还是要恢复成字符串
        String s = sb.toString();
        System.out.println(s);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("张三").append("李四").append("王五");
        System.out.println(sb2);
    }
}
