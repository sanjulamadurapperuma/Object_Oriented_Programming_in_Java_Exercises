package com.sanjula.oop.java.tutorials.Practice_Paper_1;

public class Test extends Thread {
    public volatile boolean exit = false;

     public void run(){
         while (!exit){
             System.out.println("The thread is running.........");
         }
         System.out.println("The thread is stopped...");
     }

     public void stopThread(){
         exit = true;
     }
}
