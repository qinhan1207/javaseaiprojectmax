package com.qinhan;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {

    // 定义一个集合容器存储所有登录进来的客户端管道，以便将来群发消息给他们
    // 定义一个Map集合，键是存储客户端的管道，值是这个管道的用户名称
    public static final Map<Socket,String> onLineSockets = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("启动服务端系统....");
        try {
            // 1.注册端口
            ServerSocket serverSocket = new ServerSocket(Constant.PORT);
            // 2.主线程负责接收客户端的连接请求
            while (true){
                System.out.println("等待客户端的连接......");

                Socket socket = serverSocket.accept();
                // 把这个管道交给一个独立的线程处理：以便支持很多客户端可以同时进行通信
                new ServerReaderThread(socket).start();

                System.out.println("一个客户端连接成功......");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
