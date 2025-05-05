package com.codeWithHarry;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,2,4};
        int num  = 3;
        try{
//            System.out.println(numbers[4]);
            int num2 = scanner.nextInt();
            scanner.close();
            System.out.println("The division is: " + num/num2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are trying to access non-existing location.");
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println("Invalid divisor");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Exception object printed.");
            System.out.println(e);
        }
    }
}
