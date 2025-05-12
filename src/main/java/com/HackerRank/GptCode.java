package com.HackerRank;

import java.util.Scanner;

public class GptCode {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("================================");

            for (int i = 0; i < 3; i++) {
                String str = sc.next();
                int num = sc.nextInt();

                Float a = 3.3f;
                // %-15s means left-align the string in 15 characters
                // %03d means print the number as 3 digits with leading zeroes
                System.out.printf("%-15s%03d\n", str, num);
            }

            System.out.println("================================");
        }
}
