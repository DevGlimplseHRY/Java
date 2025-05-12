package com.codeWithHarry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// Question 2 and 3
//
//@Deprecated
//class DeprecationDemo{
//    @Deprecated
//    void hi(){
//        System.out.println("Hi...");
//    }
//}
//
//@SuppressWarnings("deprecation")
//public class AdvancedJava_PracticeSet2 {
//    public static void main(String[] args) {
//        DeprecationDemo d1 = new DeprecationDemo();
//       d1.hi();
//    }
//}
//

// Question 4

//interface MyInterface{
//    public int add2Numbers(int a, int b);
//    public int add3Numbers(int a, int b, int  c);
//}
//abstract class MyInterface{
//    public abstract int add2Numbers(int a, int b);
//    public abstract int add3Numbers(int a, int b, int  c);
//}
//
//public class AdvancedJava_PracticeSet2 {
//    public static void main(String[] args) {
//        MyInterface myInterface = new MyInterface() {
//            @Override
//            public int add2Numbers(int a, int b) {
//                return a+b;
//            }
//
//            @Override
//            public int add3Numbers(int a, int b, int c) {
//                return a+b+c;
//            }
//        };
//        System.out.println(myInterface.add2Numbers(3,2));
//        System.out.println(myInterface.add3Numbers(3,2, 3));
//    }
//}


class ArithmeticOperations{
    ArrayList<Integer> multiplicationTable(int number){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            arrayList.add(number * i);
        }
        return arrayList;
    }
}

//class MyClass<TT>{
//    int a;
//    TT b;
//}


//interface My2ndInterface{
//    int sum(int a, int b);
////    int subtract(int a, int b);
//}
public class AdvancedJava_PracticeSet2 {
    public static void main(String[] args) {
//        int number = 3;

        // wrong code
//        AdvancedJava_PracticeSet2 ac = new AdvancedJava_PracticeSet2(){
//             void multiply{
//                for (int i = 1; i <= 10; i++){
//                    System.out.println(number * i);
//                }
//            }
//        };


//        File file = new File("Multiplication_Table_File");
//        try{
//            file.createNewFile();
//        }catch (FileNotFoundException e){
//            System.out.println(e);
//        }catch (IOException e){
//            System.out.println(e);
//            e.printStackTrace();
//        }
//
//        try {
//            FileWriter fileWriter = new FileWriter("Multiplication_Table_File");
//            fileWriter.write();
//        }catch (IOException e){
//            System.out.println("IoException occurred.");
//            e.printStackTrace();
//        }

//        MyClass<String> newClass = new MyClass<>();
//        String a =  newClass.b;
//        System.out.println(a);
//

//        My2ndInterface my2ndInterface = (int a, int b) -> {
//            return a+b;
//        };

//        My2ndInterface my2ndInterface = new My2ndInterface() {
//            @Override
//            public int sum(int a, int b) {
//                return a+b;
//            }
//        };
//        int sum = my2ndInterface.sum(3,8);
//        System.out.println(sum);


        // Write a program that write multiplication table of a given number to a file

//        File file = new File("Multiplication_Table_File.txt");
//        try {
//            file.createNewFile();
//        }catch (IOException e){
//            System.out.println("IO Exception occurred.");
//            e.printStackTrace();
//        }catch (Exception e){
//            System.out.println("Some other exception occurred.");
//            System.out.println(e);
//        }

        Scanner scanner = new Scanner(System.in);
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        int i = 2;
        while (i >= 2 && i <= 9){
            System.out.print("Please enter the number: ");
//                int number = scanner.nextInt();
                ArrayList<Integer> multiplicationTable = arithmeticOperations.multiplicationTable(i);
            try {
                    FileWriter fileWriter = new FileWriter("Multiplication_Table_File.txt", true);
                    fileWriter.write("The multiplication table of " + i + " is: " + String.valueOf(multiplicationTable) + "\n");
                    fileWriter.close();
                } catch (FileNotFoundException e) {
                    System.out.println("File not found exception occurred");
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println("Some other exception occurred.");
                    System.out.println(e);
                }
            i++;
            }
//        scanner.close();
//
//       file.delete();
        }

}