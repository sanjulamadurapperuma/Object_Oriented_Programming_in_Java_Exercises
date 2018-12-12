package com.sanjula.oop.java.tutorials.week_9;

public class ExtendThread {
    public static void main(String[] args) {
        //create a thread A
        PrintNameThread threadA = new PrintNameThread("A");
        threadA.start();

        //create a thread B
        PrintNameThread threadB = new PrintNameThread("B");
        threadB.start();

        //create a thread C
        PrintNameThread threadC = new PrintNameThread("C");
        threadC.start();
    }
}
