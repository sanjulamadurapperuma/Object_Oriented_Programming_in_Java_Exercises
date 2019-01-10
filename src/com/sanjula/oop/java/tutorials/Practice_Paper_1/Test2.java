package com.sanjula.oop.java.tutorials.Practice_Paper_1;

public class Test2 extends Thread {
    public void run(){
        while (!Thread.interrupted()){
            System.out.println("Thread is running.....");
        }
        System.out.println("Thread is stopped....");
    }
}
