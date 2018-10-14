package com.sanjula.oop.java.tutorials.week_2;

import com.sanjula.oop.java.tutorials.week_1.Question_3.Date;

public class TestDirector {
    public static void main(String[] args) {
        //Test constructor
        Director director = new Director("James", "Cameron");

        //Test getters and setters

        //Create an object date to represent the dob
        Date dob = new Date(16, 8, 1954);
        director.setDob(dob);

        director.setNumDirectedMovie(23);

        System.out.println(director);
        System.out.println("Name is " + director.getName());
        System.out.println("Surname is " + director.getSurname());
        System.out.println("Dob is " + director.getDob());
        System.out.println("Number of directed movies is " +
                director.getNumDirectedMovie());
    }
}
