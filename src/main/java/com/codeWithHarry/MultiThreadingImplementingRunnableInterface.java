package com.codeWithHarry;

class MyRunnableThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println("MyRunnableThread1 is running for the " + i + " time.");
        }
    }
}

class MyRunnableThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println("MyRunnableThread2 is running for the " + i + " time.");
        }
    }
}

public class MultiThreadingImplementingRunnableInterface {

    public static void main(String[] args) {
    MyRunnableThread1 thread1 = new MyRunnableThread1();
    Thread t1 = new Thread(thread1, "Ishab");
    MyRunnableThread2 thread2 = new MyRunnableThread2();
    Thread t2 = new Thread(thread2);
    t2.setPriority(Thread.MAX_PRIORITY);
    t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.getId());
    t2.start();

        System.out.println(t2.getName());
        System.out.println(t2.getId());
    }
}
