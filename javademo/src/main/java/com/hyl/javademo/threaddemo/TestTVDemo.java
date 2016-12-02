package com.hyl.javademo.threaddemo;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/12/2.
 */

public class TestTVDemo {
    public static void main(String[] args) {
        WorkHourse wh=new WorkHourse();
        Product pro=new Product(wh);
        Thread tr=new Thread(pro);
        Saler sl=new Saler(wh);
        Thread tr1=new Thread(sl);
        tr.start();
        tr1.start();
    }
}
