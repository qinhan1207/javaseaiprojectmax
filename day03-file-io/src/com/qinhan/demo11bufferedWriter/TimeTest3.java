package com.qinhan.demo11bufferedWriter;

import java.io.*;

public class TimeTest3 {

    private static final String SRC_PATH = "D:\\VMware\\VMware-workstation-full-17.6.3-24583834.exe";
    private static final String DEST_PATH = "D:\\";

    public static void main(String[] args) {
        // 目标：缓冲流，低级流性能分析
        //copyFile01();
        copyFile02();
        copyFile03();
        copyFile04();
    }

    // 使用缓冲流按照字节数组的方式复制文件
    private static void copyFile04() {
        long start = System.currentTimeMillis();
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SRC_PATH));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DEST_PATH+"4.exe"));
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用高级流和字节数组复制耗时" + (end - start) / 1000.0 + "s");
    }

    // 使用缓冲流按照一个字节一个字节的形式复制文件
    private static void copyFile03() {
        long start = System.currentTimeMillis();
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SRC_PATH));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DEST_PATH+"3.exe"));
        ) {
            int b;
            while ((b=bis.read())!=-1){
                bos.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用高级流和一个字节一个字节复制耗时" + (end - start) / 1000.0 + "s");
    }

    // 使用低级流按照字节数组的形式复制文件
    private static void copyFile02() {
        long start = System.currentTimeMillis();
        try (
                InputStream fis = new FileInputStream(SRC_PATH);
                OutputStream fos = new FileOutputStream(DEST_PATH + "2.exe");
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用低级流和字节数组复制耗时" + (end - start) / 1000.0 + "s");
    }

    // 使用低级字节流按照一个字节一个字节的形式复制文件
    private static void copyFile01() {
        // 拿系统当前时间
        long start = System.currentTimeMillis();
        try (
                InputStream fis = new FileInputStream(SRC_PATH);
                OutputStream fos = new FileOutputStream(DEST_PATH + "1.exe");
        ) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用低级流和一个字节一个字节复制耗时" + (end - start) / 1000.0 + "s");
    }

}
