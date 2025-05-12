package com.codeWithHarry;

import java.io.IOException;

@FunctionalInterface
interface MobilePhone{
    public void ring(int times);
}


class Phone1{
    @Deprecated
    public int add(int a, int b){
        return a+b;
    }
}

public class Method_Tags {

    /**
     * This is the method to get subtraction of two numbers.
     * @param i This is the first number
     * @param j This is the second number
     * @return return subtraction of first and second number
     * @throws IOException throw this kind of exception
     * @deprecated This method is deprecated. Please use + operator
     */
    @Deprecated
    public static int subtract(int i, int j) throws IOException  {
        return i-j;
    }


    /**
     *
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers[first, second] as an integer
     */
    @Deprecated
    public static int add(int i, int j) {
        return i+j;
    }

    /**
     *
     * @param args These are arguments supplied to the command line
     */

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
//        System.out.println("This is the main method.");
//        Phone1 a = new Phone1();
//        a.add(2,3);
//        System.out.println(c);

        MobilePhone mp = (times)->{
            System.out.println("Phone ringing... from lambda expression. " + times);
        };
        mp.ring(8);
    }
}