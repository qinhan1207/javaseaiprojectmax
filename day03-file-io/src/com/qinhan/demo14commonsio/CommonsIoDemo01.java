package com.qinhan.demo14commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIoDemo01 {
    public static void main(String[] args) throws IOException {
        // 目标：IO框架
        FileUtils.copyFile(new File("day03-file-io\\src\\csb.txt"),new File("day03-file-io\\src\\csb_out2.txt"));

        FileUtils.delete(new File("day03-file-io\\src\\csb_out2.txt"));
    }
}
