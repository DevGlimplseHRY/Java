package com.engineeringDigest.vehicles;
import java.util.Scanner;

public class ReadingFile {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Create a Scanner object

            while (scanner.hasNextLine()) { // Check for more lines of input
                String line = scanner.nextLine(); // Read the next line
                System.out.println("Read: " + line);
            }
            scanner.close();
        }
    }

