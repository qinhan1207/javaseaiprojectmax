package com.qinhan.demo6tcp3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader extends Thread{
    private Socket socket;

    public ServerReader(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        // 读取管道的消息
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true){
                String msg = dis.readUTF();
                System.out.println("收到的客户端信息为"+msg);
                String ip = socket.getInetAddress().getHostAddress();
                int port = socket.getPort();
                System.out.println("客户端ip"+ip);
                System.out.println("客户端端口"+port);
                System.out.println("----------------------");
            }
        } catch (Exception e) {
            System.out.println("客户端下线了："+socket.getInetAddress().getHostAddress());

        }
    }
}
