package com.sanjula.oop.java.tutorials.week_2;


public class MathematicalOperations {
    public static int abs(int x){
        return Math.abs(x);
    }

    public static double abs(double x){
        return Math.abs(x);
    }

    public static boolean isPrime(int N){
        //Check if n is a multiple of 2
        if(N <= 1) {
            return false;
        }
        //if not check the odds
        for(int i = 2; i < Math.sqrt(N); i++){
            if (N % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double sqrt(double x){
        return Math.sqrt(abs(x));
    }

    public static double log(double x){
        return Math.log(abs(x));
    }

    public static double powerOfTwo(double x){
        return Math.pow(x, 2);
    }
}
