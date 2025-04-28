package com.qinhan.demo2.udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("====服务端启动了====");
        // 目标：完成UDP通信一发一收：服务端开发
        // 1.创建一个接收端对象，注册接口
        DatagramSocket socket = new DatagramSocket(8080);
        // 2.创建一个数据包对象，用来接收数据（韭菜盘子）
        byte[] buf = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        // 3.接收数据，将数据封装到数据包对象的字节数组中去
        socket.receive(packet);
        // 4.看数据是否收到
        // 获取当前收到的数据长度
        int len = packet.getLength();
        String data = new String(buf,0,len);
        System.out.println("服务端收到了"+data);

        // 获取对方的ip对象和程序端口
        String ip = packet.getAddress().getHostAddress();
        int port = packet.getPort();
        System.out.println("对方ip"+ip+",对方端口"+port);

    }
}
