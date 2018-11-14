package com.sanjula.oop.java.tutorials.week_5;

import java.util.*;

public class TestBook {
    protected static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        int selectedOption = 1;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Please enter the details of the book as follows: ");
            System.out.println();

            System.out.println("Enter the Title : ");
            String bookName = sc.nextLine();

            System.out.println("Enter the Price: ");
            double bookPrice = sc.nextDouble();
            sc.nextLine();//Consume new line left over
            System.out.println("Enter the year the book was published : ");
            int year = sc.nextInt();
            sc.nextLine();//Consume new line left over
            System.out.print("Enter the Author's name : ");
            String authorName = sc.nextLine();


            Book newBook = new Book(bookName, year, authorName);
            newBook.setPrice(bookPrice);
            bookList.add(newBook);
            Collections.sort(bookList);

            for (Book book : bookList) {
                book.toString();
            }

            System.out.println();
            System.out.println("Press '0' if you want to exit the program");
            selectedOption = sc.nextInt();
        }while(selectedOption!=0);

        /*This is how to declare a HashMap*/
        HashMap<Book, Integer> hmap = new HashMap<>();
        //Insert the key for each book
        for (int i = 0; i < bookList.size(); i++){
            System.out.println("Please enter the number of the shelf where the book is placed: "
                    + bookList.get(i).getTitle());

            int numShelf = sc.nextInt();

            /*Adding elements to the hashmap*/
            hmap.put(bookList.get(i), numShelf);
        }


        System.out.println("Insert the number of the shelf");
        int selectedShelf = sc.nextInt();
        System.out.println("The book in shelf " + selectedShelf + " are: ");

        /*Display content using iterator*/

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();

            if (selectedShelf == (int) entry.getValue()){
                System.out.println(((Book)entry.getKey()).getTitle());
            }
        }

    }
}
