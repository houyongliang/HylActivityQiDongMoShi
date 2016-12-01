package com.hyl.javademo;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/11/30.
 */

public class Test5Demo {
    public static void main(String[] args) {
        System.out.println("1!+2!+3!+……+20!=" + getSum(3));


    }


    public static long getSum(int n) {
        int i, k, fac, sum = 0;
        for (i = 1; i <= n; i++) {
            fac = 1;
            for (k = 1; k <= i; k++)
                fac = fac * k;
            sum = sum + fac;
        }
        return sum;

    }
    public static long getToger(int n){
        int fac = 1,sum=0;
       if(n<1)
           return 0;

        for (int i = 0; i < n; i++) {
            for (int i1 =1; i1 <= fac; i1++) {
                fac*=i1;
            }

            sum=sum+fac;
        }

        return sum;
    }
}