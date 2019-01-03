package com.sanjula.oop.java.tutorials.Practice_Paper_1;

import java.util.Arrays;

public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("OOP");
        book1.setAuthor("John Smith");
        book1.setPageNumber(120);

        Book book2 = new Book();
        book2.setName("Database");
        book2.setAuthor("Katie Holmes");
        book2.setPageNumber(200);

        Book book3 = new Book();
        book3.setName("Algorithms");
        book3.setAuthor("Andrew Stephens");
        book3.setPageNumber(350);

        Book[] bookArray = new Book[3];
        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;

        Arrays.sort(bookArray);
        System.out.println("Sorted Book List: \n" + Arrays.toString(bookArray));


    }
}
