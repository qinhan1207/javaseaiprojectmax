package com.qinhan.demo7list;

import java.util.LinkedList;

public class ListDemo2 {
    public static void main(String[] args) {
        // 目标：用LinkedList做一个队列对象
        LinkedList<String> queue = new LinkedList<>();

        // 入队
        queue.addLast("赵敏");
        queue.addLast("西门吹雪");
        queue.addLast("陆小凤");
        queue.addLast("石观音");
        System.out.println(queue);
        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
        System.out.println("-----------------------");

        LinkedList<String> stack = new LinkedList<>();
        // 入栈
        stack.push("第一颗子弹");
        stack.push("第二颗子弹");
        stack.push("第三颗子弹");
        stack.push("第四颗子弹");

        // 出栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
