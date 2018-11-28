package com.sanjula.oop.java.tutorials.Lectures;

public class StackOverflowError {
    public static void foo(){
        foo();//recursive
    }

    public static void main(String args[]){
        foo();
    }
}
