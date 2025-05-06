package com.qinhan.demo5proxy2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        UserService userService = ProxyUtils.createProxy(new UserServiceImpl());

        userService.login("admin","123456");

        userService.deleteUser();

        String[] names = userService.selectUsers();
        System.out.println("查询到的用户shi"+ Arrays.toString(names));

    }
}
