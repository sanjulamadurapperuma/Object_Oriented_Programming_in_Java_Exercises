package com.sanjula.oop.java.tutorials.week_6;

import com.sanjula.oop.java.tutorials.week_1.Question_3.Date;

public class Student extends Person {
    private int id;
    private String course;

    public Student(String name, Date dateOfBirth, int id, String course) {
        super(name, dateOfBirth);
        this.id = id;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", course='" + course + '\'' +
                '}';
    }
}
