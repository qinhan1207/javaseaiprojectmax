package com.qinhan.demo7tcp4;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable{

    private Socket socket;

    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 给当前的浏览器管道响应一个网页数据回去
        try {
            OutputStream os = socket.getOutputStream();
            // 把字节输出流包装成打印流
            PrintStream ps = new PrintStream(os);
            // 写响应的网页
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println();
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<title>");
            ps.println("我是一个网页");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<h1>我是一个网页</h1>");
            ps.println("</body>");
            ps.println("</html>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
