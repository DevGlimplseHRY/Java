package com.codeWithHarry;

import java.util.Scanner;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can't be negative";
    }
}

public class Throw_Throws_keyword {

    public static double area(int radius) throws NegativeRadiusException{
        if (radius < 0){
                throw new NegativeRadiusException();
        }
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius: ");
        try {
            int radius = scanner.nextInt();
            scanner.close();
            double area = area(radius);
            System.out.println(area);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
