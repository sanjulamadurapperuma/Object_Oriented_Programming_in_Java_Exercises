package com.sanjula.oop.java.tutorials.week_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value = 0;
        System.out.println("Please enter an integer");
        try{
            value = input.nextInt();
            System.out.println("Value: " + value);
        }catch (InputMismatchException e){
            System.out.println("Wrong input: An integer should be entered");
        }

    }
}
