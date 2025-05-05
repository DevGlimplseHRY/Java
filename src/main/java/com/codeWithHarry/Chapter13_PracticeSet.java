package com.codeWithHarry;

class PrintMessage1 extends Thread{
    @Override
    public void run() {
        super.run();
//        while (true) {
//            System.out.println("good morning");
//        }
    }
}
class PrintMessage2 extends Thread{
    public PrintMessage2(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        super.run();
//        while(true){
//            System.out.println("welcome");
//        }
    }

}

public class Chapter13_PracticeSet {
    public static void main(String[] args) {
        PrintMessage1 message1 = new PrintMessage1();
        message1.start();
        PrintMessage2 message2 = new PrintMessage2("Welcome_Thread");
        message2.start();
        message2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(message1.getPriority());
        System.out.println(message2.getPriority());
        System.out.println(message2.getState());
        System.out.println(message1.getState());
    }
}
