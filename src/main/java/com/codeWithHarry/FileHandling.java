package com.codeWithHarry;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        // code to create a new file
//        File myfile = new File("ishab.txt");
//        try {
//            myfile.createNewFile();
//        }
//        catch (IOException e){
//            System.out.println("Unable to create this file");
//            System.out.println("Not print stack trace " + e);
//           e.printStackTrace();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        // code to write to a file
//        try {
//            FileWriter fileWriter = new FileWriter("ishab.txt");
//            fileWriter.write("This is our first file from this java course\nOk now bye.");
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file");
//            System.out.println("Not print stack trace " + e);
//            e.printStackTrace();
//        }

        // Reading a file
//        File myfile = new File("this.txt");
//        try {
//            Scanner scanner = new Scanner(myfile);
//            while (scanner.hasNextLine()){
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//            scanner.close();
//        }catch (FileNotFoundException e){
//            System.out.println(e);
//        }

        // Deleting a file
//        File myfile = new File("this.txt");
//        if (myfile.delete()){
//            System.out.println("The file " + myfile + " deleted successfully.");
//            System.out.println("The file " + myfile.getName() + " deleted successfully.");
//        }else {
//            System.out.println("Some problem occurred while deleting.");
//        }
    }
}
