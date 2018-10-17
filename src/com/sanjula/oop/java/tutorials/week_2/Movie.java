package com.sanjula.oop.java.tutorials.week_2;

import java.util.Arrays;

public class Movie {
    private String title;
    private String category;
    private Director director;
    private int numAward;
    private Actor[] actor;

    public Movie(String title, String category, Director director, Actor[] actor) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.actor = actor;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Director getDirector() {
        return director;
    }


    public int getNumAward() {
        return numAward;
    }

    public void setNumAward(int numAward) {
        this.numAward = numAward;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie[title = " + getTitle() + ", " + "category = " + getCategory()
                + ", " + "director name = " + director.getName() + ", " + "Director surname = "
                + director.getSurname() + ", " + "number of awards" + getNumAward() +
                " Actors: " + Arrays.toString(actor) + "]";
    }
}
