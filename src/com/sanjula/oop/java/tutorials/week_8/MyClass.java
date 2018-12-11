package com.sanjula.oop.java.tutorials.week_8;

public class MyClass {
    public static void main(String[] args) {
        //Question 1
//        int myArray[] = new int[5];
//        // trying to access element 5
//        System.out.println(myArray[5]);

        try{
            int myArray[] = new int[5];
            //trying to access element 5
            System.out.println(myArray[5]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The element " + e.getMessage() + " does not exist!");
        }
    }
}
