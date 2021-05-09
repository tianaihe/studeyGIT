package paixu;

import com.alibaba.druid.support.json.JSONUtils;

public class MyThread_runnable extends Thread{
    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(new Runnable() {
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("bbbbbbbbb");
//                }
//            }
//
//        });
        Thread t = new Thread();
//        Threadnew threadnew = new Threadnew();
//        threadnew.run();

        t.run();

        ;//开启线程
        //System.out.println("wahaa");
        t.start();
        t.join();

        System.out.println(name());
    }
    public static String name(){
       return "aaaaa";
    }


    @Override
    public void run() {

    }
}
