package com.codeWithHarry;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;
class Book{
    private String bookName;
    private String bookAuthor;
    private String issuedTo;
    private int issuedOn;

    Book(String bookName, String bookAuthor, String issuedTo, int issuedOn){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.issuedTo = issuedTo;
        this.issuedOn = issuedOn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getIssuedOn() {
        return issuedOn;
    }

    public void setIssuedOn(int issuedOn) {
        this.issuedOn = issuedOn;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Book hindi = new Book("Hindi", "Alexandar", "Tom", 2020 / 12 / 12);
            Book english = new Book("English", "Frank", "Swan", 2019 / 12 / 12);

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
//        System.out.println("Please provide below details also for the new book:\nBook Name, Book Author, Issued To, Issued On. The date format will be YYYY/MM/DD");
//        System.out.println();
//        System.out.println("Book Author: " );
//        String bookAuthor = scanner.nextLine();
//        System.out.println("Issued To: " );
//        String issuedTo = scanner.nextLine();
//        System.out.println("Issued On: " );
//        int issuedOn = scanner.nextInt();

                books.add(newBookName);
                availableBooks.add(newBookName);
//        Book newBook = new Book(newBookName, bookAuthor, issuedTo, issuedOn);
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
