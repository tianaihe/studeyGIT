package service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerThreadNoStopTest {
    private static class Task extends TimerTask {
        @Override
        public void run() {
            System.out.println("hello world!");
        }
    }

    public static void main(String[] args) throws ParseException {

        Timer timer = new Timer();
        Task task = new Task();
        long currenTime = System.currentTimeMillis();
        //提交Task线程；程序按传入日期运行
        timer.schedule(task,new Date(currenTime),5000);
    }
}
