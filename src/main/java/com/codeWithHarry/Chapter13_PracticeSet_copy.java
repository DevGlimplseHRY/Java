package com.codeWithHarry;

class PrintMessage3 implements Runnable{
    @Override
    public void run() {
//        while (true) {
//            System.out.println("good morning");
//        }
    }
}
class PrintMessage4 implements Runnable{

    @Override
    public void run() {
        System.out.println("Reference to the current thread is: " + Thread.currentThread());
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            System.out.println(e);
        }

//        while(true){
//            System.out.println("welcome");
//        }
    }

}

public class Chapter13_PracticeSet_copy {
    public static void main(String[] args) {
        PrintMessage3 t1 = new PrintMessage3();
        Thread message1 = new Thread(t1);
        message1.start();
        PrintMessage4 t2 = new PrintMessage4();
        Thread message2 = new Thread(t2, "Welcome_Thread");
        message2.start();
        message2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(message1.getPriority());
        System.out.println(message2.getPriority());
        System.out.println(message2.getState());
        System.out.println(message1.getState());
    }
}
