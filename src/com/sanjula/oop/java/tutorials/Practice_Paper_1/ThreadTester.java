package com.sanjula.oop.java.tutorials.Practice_Paper_1;

public class ThreadTester {
    public static void main(String[] args) {
        Test thread = new Test();
        thread.start();
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        thread.stopThread();
    }
}
