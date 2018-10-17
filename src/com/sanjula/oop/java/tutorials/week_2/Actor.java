package com.sanjula.oop.java.tutorials.week_2;

import com.sanjula.oop.java.tutorials.week_1.Question_3.Date;

import java.util.Arrays;

public class Actor {
    private String name;
    private String surname;
    private int numOfMoviesActedIn;
    private Date Dob;

    public Actor(String name, String surname, int numOfMoviesActedIn, Date dob) {
        this.name = name;
        this.surname = surname;
        this.numOfMoviesActedIn = numOfMoviesActedIn;
        Dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumOfMoviesActedIn() {
        return numOfMoviesActedIn;
    }

    public void setNumOfMoviesActedIn(int numOfMoviesActedIn) {
        this.numOfMoviesActedIn = numOfMoviesActedIn;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date dob) {
        Dob = dob;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + ", " + "Surname = " + getSurname()
                + ", " + "Number of Movies = " + getNumOfMoviesActedIn() + ", " + "Date of Birth = "
                + getDob() + "]";
    }
}
