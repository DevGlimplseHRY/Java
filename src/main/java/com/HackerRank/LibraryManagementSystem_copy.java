package com.HackerRank;

import java.util.ArrayList;
import java.util.Scanner;


public class LibraryManagementSystem_copy {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayList<String> books = new ArrayList<>(); // Total books
            books.add("hindi");
            books.add("english");
            ArrayList<String> availableBooks = new ArrayList<>();// Available books with or without issuing
           availableBooks.addAll(books);
            ArrayList<String> issuedBooks = new ArrayList<>(); // issued books


            System.out.println("Total books are: " + books);
            System.out.println("Available books are: " + availableBooks);
            System.out.println();
        System.out.println("Please provide 'Y' OR 'N' to answer any question: ");
        while (true) {
            System.out.println("Do you want to add a book ? ");
            char wantToAddBook = scanner.next().charAt(0);
            scanner.nextLine();

            if (wantToAddBook == 'Y' || wantToAddBook == 'y') {
                System.out.print("Please enter the book name you want to add: ");

                String newBookName = scanner.nextLine();

                books.add(newBookName);
                availableBooks.add(newBookName);
                System.out.println(newBookName + " book added.");
                System.out.println();
                System.out.println("Total books are: " + books);
            }
            System.out.println();
            System.out.println("Do you want to issue a book ? ");
            char wantToIssueBook = scanner.next().charAt(0);
            scanner.nextLine();

            if (wantToIssueBook == 'Y' || wantToIssueBook == 'y') {
                System.out.println("Enter the book name you want to issue: ");
                String issueBook = scanner.nextLine();

                if (availableBooks.contains(issueBook)) {
                    issuedBooks.add(issueBook);
                    availableBooks.remove(issueBook);
                } else {
                    System.out.println("Sorry! This book is not available right now.");
                }

            }
            if (!issuedBooks.isEmpty()){
                System.out.println("Issued books are: " + issuedBooks);
            }else {
                System.out.println("No books were issued.");
            }
            System.out.println("Available books are: " + availableBooks);
            System.out.println();

            System.out.println("Do you want to return any book? ");
            char wantToReturnBook = scanner.next().charAt(0);
            scanner.nextLine();

            if (wantToReturnBook == 'Y' || wantToReturnBook == 'y'){
                System.out.println("Please enter the book name you want to return: ");
                String returnedBookName = scanner.nextLine();
                System.out.println();
                if (issuedBooks.contains(returnedBookName)){
                    issuedBooks.remove(returnedBookName);
                    availableBooks.add(returnedBookName);
                    System.out.println();
                    System.out.println("Available books are: " + availableBooks);
                }else {
                    System.out.println("Please return an issued book or ensure the book name!");
                    System.out.println();
                }
            }
        }
    }
}