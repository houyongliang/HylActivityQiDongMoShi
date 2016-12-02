package com.hyl.javademo.threaddemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/12/2.
 */

public class TicketThread extends Thread{
    /*
 * 10张票
 * 每卖一张票需要300毫秒
 * 定义票数，如果票数大于0，卖票，如果票数为0，显示没有票了
 */
    /*票数*/
    static int num=10;
    static Object o = new Object();

    @Override
    public void run() {
        try {
            for(int i=1;i<=10;i++){
                synchronized (TicketThread.class){/*同步代码块*/

                    if(num>0){//每卖一张票需要300毫秒
                        this.sleep(200);
                        System.out.println(this.getName()+"卖了第"+i+"张票，还剩:"+(--num)+"张！");
                    }else if(num==0){
                        System.out.println("售罄！");
                        break;

                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        TicketThread tt1 = new TicketThread();
        tt1.setName("窗口1");
        TicketThread tt2 = new TicketThread();
        tt2.setName("窗口2");
        TicketThread tt3 = new TicketThread();
        tt3.setName("窗口3");
        tt1.start();
        tt2.start();
        tt3.start();

    }
}
