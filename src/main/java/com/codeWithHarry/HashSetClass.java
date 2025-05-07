package com.codeWithHarry;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        hs1.add(3);
        System.out.println(hs1);
    }
}
