package com.hyl.zhurudemo;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/12/1.
 */

public class YiLan {
    public Bean b1;
    public  void get(Bean bean){
        b1=bean;
    }
    public static void main(String[] args) {
        YiLan yiLan = new YiLan();
        yiLan.get(new Bean());
        Bean b1 = yiLan.b1;
        b1.getName();
    }
}
