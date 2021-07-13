package com.hp.controller;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 *
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String wy = "大家好!" ;
        String r1 = wy.replace("大家好!","大家好!我是程序员!");
        System.out.println("r1 = " + r1);

        String r2 = r1.replace("大家好!我是程序员!","大家好!我是优秀的程序员!");
        System.out.println("r2 = " + r2);

        String r3 = r2.replace("大家好!我是优秀的程序员!","大家好!我是牛牛的程序员!");
        System.out.println("r3 = " + r3);

        String r4 = r3.replace("大家好!我是牛牛的程序员!","我是牛牛的程序员!");
        System.out.println("r4 = " + r4);

    }
}
