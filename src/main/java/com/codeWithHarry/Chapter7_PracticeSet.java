package com.codeWithHarry;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter7_PracticeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        printMultiplicationTable(12);
//        printPattern(4);
//        calculateSumOfNNumbers(10);
//        int sumOfNNaturalNumbers = calculateSumOfNNumbers(10, 0, 0, 0);
//        int sumOfNNaturalNumbers = calculateSumOfNNumbers(10);
//        System.out.println(sumOfNNaturalNumbers);
//    for iterable approach
//        int nth_term = 1;
//        int[] fibonacciSeries = new int[nth_term+1];
//        fibonacciSeries[0] = 0;
//        fibonacciSeries[1] = 1;
//        int returnedNthTerm = printNthTermOfFibonacciSeries(nth_term, fibonacciSeries);
//        System.out.println(returned_nth_term);

//        for recursive approach
//        int nth_term = 7;
//        int i = 0;
//        int[] fibonacciSeries = new int[nth_term];
//
//        int recursiveReturnedNthTerm = printNthTermOfFibonacciSeries(i, nth_term, fibonacciSeries);
//        System.out.println("Fibonacci Series: " + Arrays.toString(fibonacciSeries));
//        System.out.println(nth_term + " term of fibonacci series is: " + recursiveReturnedNthTerm);


//        final call for fibonacci series using recursion
//        int i = 2;
//        System.out.print("Please enter the nth term you want to find in fibonacci series: ");
//        int nthTerm = scanner.nextInt();
//        if (nthTerm < 1){
//            System.out.println("Sorry! counting can't start from zero. Please enter a natural number");
//            System.exit(0);
//        }
//        int[] fibonacciSeries = new int[nthTerm];
//
//        int returned_value = printNthFibTerm(i, nthTerm, fibonacciSeries);
//        System.out.println("Fibonacci Series: "+ Arrays.toString(fibonacciSeries));
//        System.out.println("Returned value: " + returned_value);



//        int averageOfArguments = averageOfArguments(3, 6, 6, 8);
        scanner.close();
//        System.out.println(averageOfArguments);

//        printPattern(4);
//       printStarPattern(4, 4);
        printPattern1(4);

    }
//    public static void printMultiplicationTable(int number){
//        for (int i = 1; i <= 10; i++){
//            System.out.println(number + " * " + i + " =/is " + number*i);
//        }
//    }

//    public static void printPattern(int numberofRows){
//        for (int i = 0; i < numberofRows; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    public static void calculateSumOfNNumbers(int n){
//        int sum = 0;
//        for (int i = 1; i <= n; i++){
//            sum += i;
//        }
//        System.out.println("Sum of " + n + " is: " + sum);
//    }
//    Using recursion
//    public static int calculateSumOfNNumbers(int n, int count, int number, int sum){
//        if (count > n){
//            // recursive break condition
//            return sum;
//        }
//        sum += number;
//        number++;
//        count++;
//        return calculateSumOfNNumbers(n, count, number, sum);
//    }
    // Efficient way
//        public static int calculateSumOfNNumbers(int n){
//        if (n == 1){
//            return 1;
//        }
//        return n + calculateSumOfNNumbers(n-1);
//        }
//    Write a function to print nth term of fibonacci series using recursion

//    public static int printNthTermOfFibonacciSeries(int nth_term, int[] fibonacciSeries){
//        for (int i = 2; i <= nth_term; i++){
//            fibonacciSeries[i] = (fibonacciSeries[i-1] + fibonacciSeries[i-2]);
//        }
//        return fibonacciSeries[nth_term];
//    }

//    public static int printNthTermOfFibonacciSeries(int i, int nth_term, int[] fibonacciSeries) {
//        if (i == 0 || i == 1) {
//            return i;
//        }

//        if(i == nth_term) {
//            return fibonacciSeries[nth_term];
//        }
//        if(i > 1){
//            fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i-2];
//        }
//        i++;
//        return printNthTermOfFibonacciSeries(i, nth_term, fibonacciSeries);
//        int returnedNthTerm = 0;"
//       if(nth_term > 1){"
//           returnedNthTerm = printNthTermOfFibonacciSeries(nth_term-1, fibonacciSeries) + printNthTermOfFibonacciSeries(nth_term -2 , fibonacciSeries);
//           fibonacciSeries[nth_term-1] = printNthTermOfFibonacciSeries(nth_term-1, fibonacciSeries) + printNthTermOfFibonacciSeries(nth_term -2 , fibonacciSeries);
//       }
//         return returnedNthTerm;


//        fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
//        i++;
//        if (i <= nth_term) {
//            return printNthTermOfFibonacciSeries(i, nth_term - 1, fibonacciSeries) + printNthTermOfFibonacciSeries(i, nth_term - 2, fibonacciSeries);
//        }
//        return fibonacciSeries[nth_term];
//    }

// final solution for fibonacci series and nth fibonacci term using recursion
//        public static int printNthFibTerm(int i, int nthTerm, int[] fibonacciSeries){
//            fibonacciSeries[0] = 0;
//
//            if (fibonacciSeries.length > 1){
//                fibonacciSeries[1] = 1;
//                if (i >= 2) {
//                    fibonacciSeries[i] = (fibonacciSeries[i - 1] + fibonacciSeries[i - 2]);
//                    i++;
//                }
//            }
//            if (i < nthTerm)
//                printNthFibTerm(i, nthTerm, fibonacciSeries);
//            return fibonacciSeries[nthTerm-1];
//        }

//        Write a function to find average of a set of numbers passed as arguments
//
//        public static int averageOfArguments(Object... args){
//            int argsLength = args.length;
//            int sum = 0;
//            for (Object arg: args){
//                if (!(arg instanceof Integer)){
//                    System.out.println("Please enter a valid integer.");
//                    System.exit(0);
//                }
//                sum += (Integer) arg;
//            }
//            System.out.println("The number of arguments passed are:  " + argsLength);
//            return sum/argsLength;

//        }
//        public static void printPattern(int i){
//        int j = i;
//        if (j < 1){
//            return;
//        }
//
//            if (i < 1){
//                return;
//            }
//            System.out.print("*");
//            i--;
//            printPattern(i);
//        j--;
//            System.out.println();
//            printPattern(j);
//        }


//        public static void printStarPattern(int n, int i){
//                if (i == 0){
//                return;
//                }else {
//                    printStarPattern(n, i);
//                    if (n == 0){
//                        return;
//                    }
//                    System.out.print("*");
//                    printStarPattern(n-1, i);
//                }
//
//                i--;
//            System.out.println();
//        }

        static void printPattern1(int n){
            if (n > 0){
                printPattern1(n-1);
                for (int i = 0; i < n; i++){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
}