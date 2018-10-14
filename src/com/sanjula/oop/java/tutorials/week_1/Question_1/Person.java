package com.sanjula.oop.java.tutorials.week_1.Question_1;

public class Person {
    private String name;
    private String surname;
    private int age;

    /*Constructor - Create a new instance of Person */
    public Person(String n){
        this.name = n;
    }

    //Display the name
    public void displayName(){
        System.out.println(name);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
