package com.sanjula.oop.java.tutorials.week_2;

import com.sanjula.oop.java.tutorials.week_1.Question_3.Date;

public class TestActor {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Jon", "Hamm", 25,
                new Date(1972,02,02));

        Actor actor2 = new Actor("Jason", "Statham", 50,
                new Date(1979,01,25));

        System.out.println("Name: " + actor1.getName() +
                " Surname: " + actor1.getSurname() + " Number of Movies: "
                + actor1.getNumOfMoviesActedIn() + " Date of Birth: " + actor1.getDob());
        System.out.println("Name: " + actor2.getName() +
                " Surname: " + actor2.getSurname() + " Number of Movies: "
                + actor2.getNumOfMoviesActedIn() + " Date of Birth: " + actor2.getDob());
    }
}
