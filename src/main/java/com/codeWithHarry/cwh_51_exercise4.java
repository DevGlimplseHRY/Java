package com.codeWithHarry;

import java.util.Arrays;

public class cwh_51_exercise4 {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println(Arrays.toString(library.showAvailableBooks()));
        library.addBook("General Knowledge");
        System.out.println(Arrays.toString(library.showAvailableBooks()));
    }
}
