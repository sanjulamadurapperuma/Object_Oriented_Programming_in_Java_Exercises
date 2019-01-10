package com.sanjula.oop.java.tutorials.Practice_Paper_1;

public class ThreadTester2 {
    public static void main(String[] args) throws InterruptedException {
        Test2 thread = new Test2();
        thread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interrupted ");
        }
        thread.interrupt();
    }
}
