package com.sanjula.oop.java.tutorials.week_2;

import com.sanjula.oop.java.tutorials.week_1.Question_3.Date;

import java.util.Arrays;

public class TestMovie {
    public static void main(String[] args) {
        //Test constructor
        Director director = new Director("James", "Cameron");
        Date dob = new Date(16, 8, 1954);
        director.setDob(dob);
        director.setNumDirectedMovie(23);

        System.out.println(director); //Director's toString()

        Actor listActor[] = new Actor[2];
        listActor[0] = new Actor("Kate", "Washington",
                15, new Date(14, 2, 1982));

        listActor[1] = new Actor("Tom", "Cruise",
                80, new Date(16, 11, 1974));


        //Test the Movie constructor and toString();
        Movie movie = new Movie("Avatar", "Fantasy", director, listActor);
        System.out.println(movie);//Movie toString()

        //Test getters and setters
        movie.setNumAward(23);

        director.setNumDirectedMovie(23);

        System.out.println(movie);
        System.out.println("title is: " + movie.getTitle());
        System.out.println("category is: " + movie.getCategory());
        System.out.println("name of director is: " + movie.getDirector().getName());
        System.out.println("surname of director is: " + movie.getDirector().getSurname());
        System.out.println("Number of awards is: " +
                movie.getNumAward());
        System.out.println("Actors in movie: " + Arrays.toString(listActor));
    }
}
