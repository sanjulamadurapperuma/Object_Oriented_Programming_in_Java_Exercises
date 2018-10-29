package com.sanjula.oop.java.tutorials.week_3.Exercise_2;

public class Teacher extends  Person {
    private double salary;
    private String subject;

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Salary=" + salary +
                ", Subject='" + subject + '\'' +
                ", Name='" + myName + '\'' +
                ", Age=" + myAge +
                ", Gender='" + myGender + '\'' +
                '}';
    }
}
