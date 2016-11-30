package com.hyl.javademo;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/11/30.
 */

public class Test4Demo {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if(i!=j && j!=k && i!=k){
                        count ++;
                        System.out.println(i*100+j*10+k);
                    }
                }
            }
        }
        System.out.println("共有"+count+"个数");

    }
}
