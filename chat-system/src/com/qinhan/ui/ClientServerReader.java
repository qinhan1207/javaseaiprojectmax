package com.qinhan.ui;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientServerReader extends Thread {
    private Socket socket;
    private DataInputStream dis;
    private ClientChatFrame win;
    public ClientServerReader(ClientChatFrame win,Socket socket){
        this.win = win;
        this.socket = socket;
    }

    @Override
    public void run(){
        try {
            dis = new DataInputStream(socket.getInputStream());
            // 接收消息的类型可能有两种 1代表在线人数更新的数据 2代表群聊
            while (true) {
                int type = dis.readInt();
                switch (type){
                    case 1:
                        // 服务端发来的在线人数更新消息
                        updateClientOnLineUserList();
                        break;
                    case 2:
                        // 服务端发送来的群聊消息
                        getMsgToWin();
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getMsgToWin() throws Exception {
        // 获取群聊消息
        String msg = dis.readUTF();
        win.setMsgToWin(msg);

    }

    // 更新客户端的在线用户列表
    private void updateClientOnLineUserList() throws IOException {
        // 1.读取有多少个在线用户
        int count = dis.readInt();
        // 2.循环控制读取多少个用户信息
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            // 3.读取每个用户的信息
            String nickname =dis.readUTF();
            // 4.将每个用户的信息存入数组中
            names[i] = nickname;
        }
        // 5.更新到窗口界面上的右侧展示出来
        win.updateOnlineUsers(names);
    }
}
