package com.hp.controller;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 *
 */
public class Test01 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        test1(str);//1:输出字符串"HelloWorld"的字符串长度
        test2(str);//2:输出"HelloWorld"中"o"的位置
        test3(str);//3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
        test4(str);//4:截取"HelloWorld"中的"Hello"并输出
        test5(str);//5:截取"HelloWorld"中的"World"并输出
        String str2 = "   Hello   ";
        test6(str2);//6:将字符串"  Hello   "中两边的空白去除后输出
        test7(str);//7:输出"HelloWorld"中第6个字符"W"
        test8(str);//8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
        test9(str);//9:将"HelloWorld"分别转换为全大写和全小写并输出。
    }

    private static void test9(String str) {
        String u = str.toUpperCase();//全大写
        System.out.println("u = " + u);

        String l = str.toLowerCase();//全小写
        System.out.println("l = " + l);

    }

    private static void test8(String str) {
        boolean h = str.startsWith("h");//以....开头
        System.out.println("h = " + h);

        boolean ld = str.endsWith("ld");//以....结尾
        System.out.println("ld = " + ld);
    }

    private static void test7(String str) {
        char t7 = str.charAt(5);
        System.out.println("t7 = " + t7);
    }

    private static void test6(String str2) {
        String t6 = str2.trim();
        System.out.println("t6 = " + t6);
    }

    private static void test5(String str) {
        String t5 = str.substring(5);
        System.out.println("t5 = " + t5);
    }

    private static void test4(String str) {
        String t4 = str.substring(0,5);
        System.out.println("t4 = " + t4);
    }

    private static void test3(String str) {
        Integer t3 = str.indexOf("o",5);
        System.out.println("t3 = " + t3);
    }

    private static void test2(String str) {
        Integer t2 = str.indexOf("o");
        System.out.println("t2 = " + t2);
    }

    private static void test1(String str) {
        Integer t1 = str.length();
        System.out.println("t1 = " + t1);
    }

}
