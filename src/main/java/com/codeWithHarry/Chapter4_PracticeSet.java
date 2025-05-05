package com.codeWithHarry;
import java.util.Scanner;
public class Chapter4_PracticeSet {
    public static void main(String[] args) {
        byte[] marks = new byte[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your 1st subject marks: ");
        marks[0] = scanner.nextByte();
        if (marks[0] < 0 || marks[0] > 100){
            System.out.println("Marks can't be less than 0 or more than 100.");
            System.exit(0);
        }
        System.out.print("Please enter your 2nd subject marks: ");
        marks[1] = scanner.nextByte();
        if (marks[1] < 0 || marks[1] > 100){
            System.out.println("Marks can't be less than 0 or more than 100.");
            System.exit(0);
        }
        System.out.print("Please enter your 3rd subject marks: ");
        marks[2] = scanner.nextByte();
        if (marks[2] < 0 || marks[2] > 100){
            System.out.println("Marks can't be less than 0 or more than 100.");
            System.exit(0);
        }
        scanner.close();
        String result = "Pass";
        int totalMarksObtainedFrom = marks.length * 100;
        int marksLength = marks.length;

        int total_overall_percentage = ((marks[0] + marks[1] + marks[2]) * 100) / totalMarksObtainedFrom;
        if (total_overall_percentage > 40){
            for (int mark : marks) {
                if (mark < 33) {
                    result = "Fail";
                }
            }
        }
        System.out.println("You are: " + result);
        System.out.println("Your total percentage is: " + total_overall_percentage + "%");
    }
}
