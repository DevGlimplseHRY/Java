package com.codeWithHarry;

class MyThread1 extends Thread {
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++){
            System.out.println("MyThread1 is running... for the " + i + " time.");
            System.out.println();
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("MyThread2 is running... for the " + i + " time.");
            System.out.println();
        }
    }
}
class MyThread3 extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("MyThread3 is running... for the " + i + " time.");
            System.out.println();
        }
    }
}

public class MultiThreadingExtendingThreadClass {
    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        MyThread3 thread3 = new MyThread3();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
