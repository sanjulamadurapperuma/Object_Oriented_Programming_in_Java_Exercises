package com.sanjula.oop.java.tutorials.week_6;

import com.sanjula.oop.java.tutorials.week_1.Question_3.Date;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, Date dateOfBirth, double salary) {
        super(name, dateOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}';
    }
}
