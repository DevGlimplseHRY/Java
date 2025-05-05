package com.codeWithHarry;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid input";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "The entered number cannot be divided by zero.";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "The parameter value cannot be greater than 100000.";
    }
}
class MaxMultiplierException extends Exception{
    @Override
    public String toString() {
        return "The multiplication parameter value cannot be greater than 7000.";
    }
}

public class CustomCalculator {

    public static int add(Integer a, Integer b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }
    public static int multiplication(int a, int b) throws MaxMultiplierException{
        if (a > 7000 || b > 7000){
            throw new MaxMultiplierException();
        }
        return a*b;
    }
    public static int division(int a, int b) throws CannotDivideByZeroException{
        if (a == 0 || b == 0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the value of a: ");
            int a = scanner.nextInt();
            System.out.print("Enter the value of b: ");
            int b = scanner.nextInt();
            int result = add(a,b);
//            System.out.println(multiply);
//            int multiply = multiplication(a, b);
            System.out.println(result);
        } catch (InputMismatchException e){
            System.out.println("Input mismatch exception occurred.");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
//        try {
//            System.out.println(division(3,0));
//        }catch (Exception e){
//            System.out.println(e);
//        }

    }
}
