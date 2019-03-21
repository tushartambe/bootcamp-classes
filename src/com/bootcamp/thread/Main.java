package com.bootcamp.thread;

public class Main {
    public static void main(String[] args) {
        Thread mythread = new Thread(new MyThread("Thread1"));
        Thread myThread = new Thread(new MyThread("Thread2"));

        mythread.start();
        myThread.start();
    }
}
