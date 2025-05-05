package com.codeWithHarry;
import java.util.ArrayList;

public class CollectionFramework {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(3);
        li.add(2);
        li.add(1);
        li.add(34);
        li.add(32);
        li.add(0, 4);

        for (Integer integer : li) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println(li);
        System.out.println("To string method: " + li.toString());
    }
}
