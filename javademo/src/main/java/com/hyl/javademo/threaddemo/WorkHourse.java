package com.hyl.javademo.threaddemo;

/**
 * 生产10台小米电视
 * 当库存量count==4时，不能生产，生产完一台电视，要通知一下消费线程，告知可以消费了
 * 当库存量count==0时，不能消费；消费了一台电视，要通知一下生产线程，告知可以生产了
 */

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/12/2.
 */

public class WorkHourse {
    int count=0; /*库存*/
    boolean bfalg=true;/*是否可生产标识*/
    boolean sfalg=false;/*是否可销售标识*/
    /*生产电视*/
    public synchronized void addTV(int i){
        if(!bfalg){/*等待消耗库存*/
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

            count++;
            System.out.println(Thread.currentThread().getName()+"生产了第"+i+"台电视，库存为"+count+"台");
            sfalg=true;
            if(count==4){/*库房满了，不再生产*/
                bfalg=false;
                    }
        this.notify();/*唤醒消费线程*/
    }

    public synchronized void takeTV(int i){
        if(!sfalg){/*等待消耗库存*/
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        count--;
        System.out.println(Thread.currentThread().getName()+"消费了第"+i+"台电视，库存为"+count+"台");
        bfalg=true;
        if(count==0){/*库房没了，不再消费*/
            sfalg=false;
        }
        this.notify();/*唤醒消费线程*/

    }


}
