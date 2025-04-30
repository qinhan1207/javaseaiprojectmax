package com.qinhan.ui;

import javax.swing.*;
import java.awt.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatEntryFrame extends JFrame {

    private JTextField nicknameField;
    private JButton enterButton;
    private JButton cancelButton;
    private Socket socket; // 用来记住当前客户端的通信管道

    public ChatEntryFrame() {
        setTitle("局域网聊天室");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); // 禁止调整大小

        // 设置背景颜色
        getContentPane().setBackground(Color.decode("#F0F0F0"));

        // 创建主面板并设置布局
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.decode("#F0F0F0"));
        add(mainPanel);

        // 创建顶部面板
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        topPanel.setBackground(Color.decode("#F0F0F0"));

        // 标签和文本框
        JLabel nicknameLabel = new JLabel("昵称:");
        nicknameLabel.setFont(new Font("楷体", Font.BOLD, 16));
        nicknameField = new JTextField(10);
        nicknameField.setFont(new Font("楷体", Font.PLAIN, 16));
        nicknameField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        topPanel.add(nicknameLabel);
        topPanel.add(nicknameField);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // 按钮面板
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(Color.decode("#F0F0F0"));

        enterButton = new JButton("登录");
        enterButton.setFont(new Font("楷体", Font.BOLD, 16));
        enterButton.setBackground(Color.decode("#007BFF"));
        enterButton.setForeground(Color.WHITE);
        enterButton.setBorderPainted(false);
        enterButton.setFocusPainted(false);

        cancelButton = new JButton("取消");
        cancelButton.setFont(new Font("楷体", Font.BOLD, 16));
        cancelButton.setBackground(Color.decode("#DC3545"));
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBorderPainted(false);
        cancelButton.setFocusPainted(false);

        buttonPanel.add(enterButton);
        buttonPanel.add(cancelButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // 添加监听器
        enterButton.addActionListener(e -> {
            String nickname = nicknameField.getText();
            nicknameField.setText("");
            if (!nickname.isEmpty()) {
                // 1.请求一个socket管道，建立与服务端的连接
                try {
                    login(nickname);
                    // 进入聊天室逻辑：启动聊天界面。把昵称传给聊天界面
                    new ClientChatFrame(nickname,socket);
                    this.dispose(); // 关闭窗口
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                // 立即发送登录消息给服务端程序。

            } else {
                JOptionPane.showMessageDialog(this, "请输入昵称!");
            }
        });

        cancelButton.addActionListener(e -> System.exit(0));

        this.setVisible(true);
    }

    private void login(String nickname) throws IOException {
        // 立即发送登录消息给服务端程序
        // 1.创建Socket管道，请求与服务端的socket连接
        socket = new Socket(Constant.SERVER_IP,Constant.SERVER_PORT);
        // 2.立即发送消息类型1和自己的昵称给服务端
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeInt(1);    // 消息类型 登录
        dos.writeUTF(nickname);
        dos.flush();
    }

    public static void main(String[] args) {
        new ChatEntryFrame();
    }
}