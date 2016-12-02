package com.example;



public class RunTicket implements Runnable{
    int num=10;
    static Object o=new Object();
    @Override
    public void run() {
        while(num>0){

//            try{
//                synchronized (this){/*同步代码块*/
//                    if(num>0){/*每卖一张票睡300ms*/
//                        Thread.currentThread().sleep(300);
//                        System.out.println(Thread.currentThread().getName()+"卖了第"+(10-num)+"张票，还剩"+(--num)+"张票");
//                    }else if(num==0){
//                        System.out.println("售罄！");
//                    }
//
//                }
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
            print();

        }



    }

    public synchronized  void print(){
        try{

                    if(num>0){/*每卖一张票睡300ms*/
                        Thread.currentThread().sleep(300);
                        System.out.println(Thread.currentThread().getName()+"卖了第"+(10-num)+"张票，还剩"+(--num)+"张票");
                    }else if(num==0){
                        System.out.println("售罄！");
                    }

                }

            catch (Exception e){
                e.printStackTrace();
            }
    }
    public static void main(String[] args) {
        RunTicket rt=new RunTicket();
        Thread th1=new Thread(rt,"窗口1");
        Thread th2=new Thread(rt,"窗口2");
        Thread th3=new Thread(rt,"窗口3");
        th1.start();
        th2.start();
        th3.start();

    }



}
