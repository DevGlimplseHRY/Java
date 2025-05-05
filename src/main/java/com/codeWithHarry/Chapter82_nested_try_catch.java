package com.codeWithHarry;

import java.util.Scanner;

public class Chapter82_nested_try_catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[3];
        int ind;
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        boolean validIndexFlag = true;
            try {
                System.out.println("Welcome to video no 82.");
//                if (!(scanner.hasNextInt())){
//                    break;
//                }
                while (validIndexFlag) {
                    try {
                        ind = scanner.nextInt();
//                    int marksArrayLength = marks.length;
//                    if (ind < marksArrayLength && ind >= 0){
//                        break;
//                    }
                        System.out.println(marks[ind]);
                        validIndexFlag = false;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                        System.out.println("Exception occurred at level 2.");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Exception occurred at level 1.");
                System.out.println();
            }
        System.out.println("Thanks for using this program.");
    }

}
