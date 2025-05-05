package com.codeWithHarry;

public class Library {
    private String[] availableBooks = new String[10];

    {
        availableBooks[0] = "Hindi";
        availableBooks[1] = "English";
        availableBooks[2] = "Maths";
    }
    String[] issueBooks = new String[10];

    public void addBook(String book){
        int availableBooksCount = availableBooks.length;
        for (int i = 0; i < availableBooksCount; i++){
            if (availableBooks[i] == null){
               availableBooks[i] = book;
               break;
            }
        }
    }
    public void issueBook(){

    }
    void returnBook(){}
    public String[] showAvailableBooks(){
        return availableBooks;
    }
    // array to store issue and available books
}

