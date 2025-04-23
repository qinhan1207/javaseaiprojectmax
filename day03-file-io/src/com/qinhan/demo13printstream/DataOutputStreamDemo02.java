package com.qinhan.demo13printstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo02 {
    public static void main(String[] args) {
        // 目标：特殊数据流的使用
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("day03-file-io/src/data.txt"))
        ) {
            dos.writeByte(34);
            dos.writeUTF("你好");
            dos.writeInt(88);
            dos.writeDouble(99.9);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
