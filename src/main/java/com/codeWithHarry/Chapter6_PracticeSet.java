package com.codeWithHarry;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Chapter6_PracticeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int[] findInteger = {23, 32, 45};
        int findIntegerArrayLength = findInteger.length;
        for (int i = 0; i < findIntegerArrayLength; i++) {
            if (findInteger[i] == 32) {
                System.out.println("Number is present at index: " + i);
                break;
            }
        }

        System.out.print("Please enter the number of students for physics marks: ");
        int size = scanner.nextInt();
        int[] physicsMarks = new int[size];
        int totalMarks = 0;
        for (int i = 0; i < physicsMarks.length; i++){
            System.out.println("Please enter the marks of student " + i);
            physicsMarks[i] = scanner.nextInt();
            totalMarks += physicsMarks[i];
        }
        int calculateAverage = (totalMarks * 100) / (size * 100);
        System.out.println(physicsMarks.length);
        System.out.println("Average marks: " + calculateAverage);
        System.out.println(Arrays.toString(physicsMarks));

// Write a java program to add two matrices of size 2 x 3
        System.out.print("Please enter the row size for 1st array: ");
        final int rowSize = scanner.nextInt();
        System.out.print("Please enter the column size for 1st array: ");
        final int columnSize = scanner.nextInt();
        int[][] firstArray = new int[rowSize][columnSize];
        firstArray[0][0] = 1;
        firstArray[0][1] = 2;
        firstArray[0][2] = 3;
        firstArray[1][0] = 1;
        firstArray[1][1] = 2;
        firstArray[1][2] = 3;

        System.out.print("Please enter the row size for 2nd array: ");
        final int secondArrayRowSize = scanner.nextInt();
        System.out.print("Please enter the column size for 2nd array: ");
        final int secondArrayColumnSize = scanner.nextInt();

        int[][] secondArray = new int[secondArrayRowSize][secondArrayColumnSize];
        secondArray[0][0] = 1;
        secondArray[0][1] = 2;
        secondArray[0][2] = 3;
        secondArray[1][0] = 1;
        secondArray[1][1] = 2;
        secondArray[1][2] = 3;

        System.out.println("First array:  " + Arrays.deepToString(firstArray));
        System.out.println("Second array: " + Arrays.deepToString(secondArray));

        int[][] finalArray = new int[rowSize][columnSize];

        if (rowSize != secondArrayRowSize || columnSize != secondArrayColumnSize){
            System.out.println("Sorry!, Can't perform add operation between different size arrays.");
            System.exit(0);
        }

        for (int i = 0; i < rowSize; i++){
           for (int j = 0; j < columnSize; j++){
               finalArray[i][j] = firstArray[i][j] + secondArray[i][j];
           }
        }
        System.out.println();
        System.out.println("Final array: " + Arrays.deepToString(finalArray));


//        Write a java program to reverse an array
        int[] nonReversedArray = {1, 2, 3};
        int nonReversedArraySize = nonReversedArray.length;
        int[] reversedArray  = new int[nonReversedArraySize];
        int reversedArrayStartingIndex = 0;
        for (int i = nonReversedArraySize -1 ; i >= 0; i--){
            reversedArray[reversedArrayStartingIndex] = nonReversedArray[i];
            reversedArrayStartingIndex++;
        }
        System.out.println("Non-reversed array: " + Arrays.toString(nonReversedArray));
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

//        Write a java program to find the minimum element in an array
        int shortestElement = Integer.MAX_VALUE;
        for (int i = 0; i < nonReversedArraySize; i++){
            if (nonReversedArray[i] < shortestElement){
                shortestElement = nonReversedArray[i];
            }
        }
        System.out.println("Shortest element is: " + shortestElement);

//        Write a java program to find the maximum element in an array

        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < nonReversedArraySize; i++){
            if (nonReversedArray[i] > largestElement){
                largestElement = nonReversedArray[i];
            }
        }
        System.out.println("Largest element is: " + largestElement);


//        Write a java program to find whether an array is sorted or not.

        int[] unsortedArray = {32, 11, 43, 2};
//        int[] unsortedArray = {2, 11, 32, 43};
        boolean sortedArray = true;
        int unsortedArrayLength = unsortedArray.length;
        for (int i = 0; i < unsortedArrayLength; i++){
            if (i == unsortedArrayLength -1){
                break;
            }
            if (!(unsortedArray[i] <= unsortedArray[i+1])){
                sortedArray = false;
                break;
            }
        }
        System.out.println("The array is sorted: " + sortedArray);

         */
        scanner.close();

        
    }
}
