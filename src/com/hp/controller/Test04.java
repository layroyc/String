package com.hp.controller;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 *
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个email地址：");
        String email = scanner.nextLine();

        String[] a = email.split("@");
        System.out.println("a[0] = " + a[0]);

        /*第二种
        int ww = email.indexOf("@");//返回@的下标

        String yy = email.substring(0,ww);
        System.out.println("yy = " + yy);*/
    }
}
