package com.bootcamp.thread;

public class MyThread implements Runnable {
    private String threadName;

    public MyThread(String threadName) {

        this.threadName = threadName;
    }

    @Override
    public void run() {
//        System.out.println(threadName);
        for (int i=1; i<11; i++){
            System.out.println(i + " " + threadName);
        }
    }
}
