package com.codeWithHarry;
import java.util.LinkedList;
public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(12);
        l2.add(13);
        l2.add(14);
        l1.add(3);
        l1.add(2);
        l1.add(1);
        l1.add(34);
        l1.add(3);
        l1.add(32);
        l1.add(0, 4);
        l1.addAll(l2);
        l1.addLast(777);
        l1.addFirst(788);

        System.out.println("Last element: " + l1.getLast());
        System.out.println(l1.listIterator(12));


//        System.out.println("Hashcode in linked list: " + l1.hashCode());
//        System.out.println("Is linked list empty: " + l1.isEmpty());
//        System.out.println("Parallel Stream for linked list : " + l1.parallelStream());
//        System.out.println("Remove the linked list : " + l1.remove(0));
//        System.out.println(l1.get(1));
//        l1.ensureCapacity(232);
//        System.out.println(l1.contains(30));
//        System.out.println(l1.indexOf(3));
//        System.out.println(l1.lastIndexOf(3));

//        for (Integer integer : l1) {
//            System.out.print(integer + " ");
//        }
//        System.out.println();
        System.out.println(l1);
//        System.out.println("To string method in linked list : " + l1.toString());
    }
}
