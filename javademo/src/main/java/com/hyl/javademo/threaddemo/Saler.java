package com.hyl.javademo.threaddemo;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/12/2.
 */

public class Saler implements Runnable{
    public WorkHourse wh;
    public Saler(WorkHourse wh) {
        super();
        this.wh = wh;
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            wh.takeTV(i);
        }
    }
}
