package com.sanjula.oop.java.tutorials.week_5;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList test = new LinkedList();

        test.insertAtEnd(2);
        test.insertAtEnd(4);
        test.insertAtEnd(6);
        test.insertAtEnd(8);
        test.insertAtEnd(10);

        try {
            test.traverse();
            int deleted  = (int) test.deleteAtEnd();
            System.out.println(deleted);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
