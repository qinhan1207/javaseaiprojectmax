package com.qinhan.demo3udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("====客户端启动了====");
        // 目标：完成UDP通信，多发多收：客户端开发。
        // 1.创建发送端对象（代表抛韭菜的人）
        DatagramSocket socket = new DatagramSocket();
        // 2.创建数据包对象封装要发送的数据(代表韭菜盘子）
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();
            // 如果用书输入的是exit
            if (msg.equals("exit")){
                System.out.println("客户端退出");
                socket.close();
                break;
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length,InetAddress.getLocalHost(),8080);

            // 3.让发送端对象发送数据包的数据
            socket.send(packet);
        }
    }
}
