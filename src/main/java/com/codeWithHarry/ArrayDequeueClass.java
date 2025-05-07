package com.codeWithHarry;

import java.util.ArrayDeque;

public class ArrayDequeueClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq1 = new ArrayDeque<>();
        adq1.add(3);
        adq1.add(7);


        System.out.println(adq1);
        System.out.println(adq1.getFirst());
    }
}
