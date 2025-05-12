package com.codeWithHarry;

@FunctionalInterface
interface Anony{
    void display();
}

public class Anonymous_Lambda {
    public static void main(String[] args) {
        Anony d1 = () -> {
                System.out.println("Hi...");
        };
        d1.display();
    }
}
