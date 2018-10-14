package com.sanjula.oop.java.tutorials.week_2;

public class Movie {
    private String title;
    private String category;
    private Director director;
    private int numAward;

    public Movie(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
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

    @Override
    public String toString() {
        return "Movie[title = " + getTitle() + ", " + "category = " + getCategory()
                + ", " + "director name = " + director.getName() + ", " + "Director surname = "
                + director.getSurname() + ", " + "number of awards" + getNumAward() + "]";
    }
}
