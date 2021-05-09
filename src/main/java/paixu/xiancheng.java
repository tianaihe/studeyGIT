package paixu;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class xiancheng {
    public static void main(String[] args) {
        //todo 为什么重写了run调用ta'ra't'
        // 不管是什么方式实现多线程
        // 必须是.start()  这个县城才启动**>

        // runnable这个才是匿名内部类  new出来的对象
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("ko");
            }
        };
        Thread thread =   new Thread(runnable);
        thread.start();
       /* Thread thread = new Thread();*/
        //Thread thread = new Thread;
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
