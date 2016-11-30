package com.hyl.javademo;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/11/30.
 */

public class Test10Demo {
    public static void main(String[] args) {
        boolean b = false;
        System.out.print(2 + " ");
        System.out.print(3 + " ");
        for (int i = 3; i < 100; i += 2) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            if (b == true) {
                System.out.print(i + " ");
            }
        }
    }

}
