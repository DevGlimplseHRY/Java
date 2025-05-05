package com.codeWithHarry;

class Monkey extends Thread {
    void jump(){}
    void bite(){}
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal {
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
