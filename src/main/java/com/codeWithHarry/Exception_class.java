package com.codeWithHarry;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }

    @Override
    public String toString() {
        return "I am toString()";
    }
}

public class Exception_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        if(a < 9){
            try {
                throw new MyException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }


    }
}
