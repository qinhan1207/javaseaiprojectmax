package com.qinhan.demo2.udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("====客户端启动了====");
        // 目标：完成UDP通信，一发一收：客户端开发。
        // 1.创建发送端对象（代表抛韭菜的人）
        DatagramSocket socket = new DatagramSocket();
        // 2.创建数据包对象封装要发送的数据(代表韭菜盘子）
        byte[] bytes = "我是客户端，约你今晚啤酒、龙虾、小烧烤".getBytes();
        /**
         * public DatagramPacket(byte[] buf, int length,
         *                           InetAddress address, int port)
         * 参数一：发送的数据，字节数组（韭菜）
         * 参数二：发送的长度
         * 参数三：目的地的IP地址
         * 参数四：服务端程序的端口号
         */
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,InetAddress.getLocalHost(),8080);

        // 3.让发送端对象发送数据包的数据
        socket.send(packet);
    }
}
