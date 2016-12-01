package com.hyl.zhurudemo;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/12/1.
 */

public class Runnabledemo extends  Thread{
    @Override
    public void run() {
        System.out.println("你有内涵。。。");

    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        new Threaddemo().start();
        System.out.println("----------------------------------------------");
        new Thread(new Runnabledemo()).start();
    }
}
