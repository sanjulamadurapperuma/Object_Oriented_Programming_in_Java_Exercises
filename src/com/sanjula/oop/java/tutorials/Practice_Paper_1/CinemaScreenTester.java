package com.sanjula.oop.java.tutorials.Practice_Paper_1;

public class CinemaScreenTester {
    public static void main(String[] args){
        CinemaScreen screen = new CinemaScreen();
        screen.setName("Screen 1");
        screen.setSeatsNum(50);
        System.out.println("The screen name is " +
                screen.getName() +
                " the number of seats is " +
                screen.getSeatsNum());
    }
}
