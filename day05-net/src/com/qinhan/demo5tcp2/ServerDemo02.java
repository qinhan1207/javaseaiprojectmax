package com.qinhan.demo5tcp2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo02 {
    public static void main(String[] args) throws Exception {
        // 目标：实现TCP通信下的多发多收：服务端开发
        System.out.println("====服务端启动====");
        // 1.创建服务端ServerSocket对象，绑定端口，监听客户端连接
        ServerSocket ss = new ServerSocket(9999);
        // 2.调用accept方法，阻塞式等待客户端连接，一旦客户端连接会返回一个Socket对象
        Socket socket = ss.accept();
        // 3.获取输入流，读取客户端发送的数据
        InputStream is = socket.getInputStream();
        // 4.把字节输入流包装成特殊数据输入流
        DataInputStream dis = new DataInputStream(is);
        // 5.读取数据
        while (true) {
            String msg = dis.readUTF(); // 等待读取客户端发送的数据
            System.out.println("收到的客户端msg为" + msg);
            // 6.客户端的ip和端口（谁给我发的）
            System.out.println("客户端的ip为" + socket.getInetAddress().getHostAddress());
            System.out.println("客户端的端口为" + socket.getPort());
            System.out.println("--------------------------------------");
        }

    }
}
