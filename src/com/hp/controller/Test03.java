package com.hp.controller;
/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 *
 *
 *
 */
public class Test03 {
    public static void main(String[] args) {
        /*
         * 编写一个回文字符串，然后调用check方法检查
         * 该字符串是否为回文，然后输出检查结果。
         * 若是回文则输出:是回文
         * 否则输出:不是回文
         */
        String str = "qweryuirewq";
        check(str);


    }

    private static boolean check(String str) {
        StringBuilder sb = new StringBuilder(str);
        String after = sb.reverse().toString();
        System.out.println("sb = " + sb);
        int ss = after.compareTo(str);
        if (ss == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return false;
    }
}
