package com.hyl.javademo;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/11/30.
 */

public class Test3Rubbit {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        for (int i = 0; i < 12; i++) {
            a=b;
            b=c;
            c=a+b;
            System.out.println("第 "+i+"个月"+c+"对");
        }
                
                
    }
}
