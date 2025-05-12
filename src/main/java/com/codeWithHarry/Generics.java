package com.codeWithHarry;

import java.util.ArrayList;

class MyGenerics<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    public T2 getT2(){
        return t2;
    }
    public void setT2(T2 t2){
        this.t2 = t2;
    }
}

public class Generics {
    public static void main(String[] args) {
//        ArrayList<Integer> a1 = new ArrayList<Integer>();
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(32);
//        arrayList.add("ds");
//        arrayList.add(55);
////
////        a1.add(32);
////        a1.add(31);
////        a1.add("ds");
////        a1.add(55);
//        int a = (int) arrayList.get(1);
////        int a = a1.get(2);
//        System.out.println(a);
////        System.out.println(a1);
//        System.out.println(arrayList);


//        MyGenerics<Integer> myGenerics = new MyGenerics();
        MyGenerics<String, Integer> g1 = new MyGenerics(32, "MyString is ", 434);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str);
        System.out.println(int1);
    }
}
