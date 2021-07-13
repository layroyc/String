package com.hp.controller;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        // 作业: 写一个 private 方法, 需要 传一个 string 的 网址参数, 返回 处理后的数据.
        // 假定 大数据获取了 很多网址, 我想要 www -----  com 之间的内容
        // 有一下  几类网址
        // www.oracle.com  ---->  oracle
        // www.oracle.com.cn  ---->  oracle
        // www.java.oracle.com.cn  ---->  java.oracle
        // www.lol.game.qq.com.cn  ---->  lol.game.qq
        // www.game.mycom.com.cn  ---->  game.mycom
        // www.girl.mycom.com.cn  ---->  girl.mycom
        // www.computer.mycom.com.cn  ---->  computer.mycom

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入网址：");
        String wy = scanner.nextLine();
        test1(wy);
    }

    private static void test1(String wy) {
        Integer w = wy.indexOf("www.");//返回指定字符在字符串对象中首次出现的索引
        System.out.println("w = " + w);

        Integer y = wy.indexOf(".com");
        System.out.println("y = " + y);

        String roy = wy.substring(w+4,y);//截取
        System.out.println("roy = " + roy);
    }
}
