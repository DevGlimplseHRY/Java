package com.codeWithHarry;
import java.util.Scanner;

public class Chapter5_PracticeSet_Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (true) {
//        for (int i = 0; i < 4; i++){
//            for (int j = 4; j > i; j--){
//                System.out.print('*');
//            }
//            System.out.println();
//        }


//        int first_N_Numbers = scanner.nextInt();
//        scanner.close();
//        int i=0, sum = 0;
//
//        while (i < first_N_Numbers){
//            if (i % 2 == 0 && i > 0){
//                sum += i;
//                System.out.println(i);
//                first_N_Numbers++;
//            }
//            i++;
//        }
//        System.out.println("Sum of " + first_N_Numbers + " is: " + sum);
//
//        int sum = 0;
//        int first_N_Numbers = scanner.nextInt();
//        int loopLength = first_N_Numbers * 2;
//
//        for (int i = 1; i <= loopLength; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        System.out.println("Total sum is: " + sum);
//
//        int i = 1;
//        int sum = 0;
//        while (i <= 10) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//            i++;
//        }
//        System.out.print("Sum is: " + sum);

            //3rd question
            // Write a program to print multiplication table of a given number n.

//        int n = scanner.nextInt();
//        System.out.println("The multiplication table of " + n + " is:");
//        for (int i = 1; i <= 10; i++){
//            System.out.println("2 * " + i + ": " + (n * i));
//        }
//
//      Write a program to print multiplication table of 10 in reverse order.
//            int n = scanner.nextInt();
//            System.out.println("The multiplication table of " + n + " is:");
//            for (int i = 10; i >= 1; i--) {
//                System.out.println("2 * " + i + ": " + (n * i));
//            }



//      Blank Diamond problem

        int startRow = 0;
        int endRow = 5;
        int startColumn = 0;
        int endColumn = 5;

        for (int i = 1; i <= 1; i++){
            for (int j = startColumn; j < i; i++){
                System.out.println('*');
            }
        }

//        }
    }
}
