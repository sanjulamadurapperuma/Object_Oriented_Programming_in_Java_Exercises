package com.sanjula.oop.java.tutorials.week_3.Exercise_2;

public class Student extends Person{
    private int IDNumber;
    private double fee;
    private int grade;

    public Student(String name, int age, String gender, int IDNumber, double fee, int grade) {
        super(name, age, gender);
        this.IDNumber = IDNumber;
        this.fee = fee;
        this.grade = grade;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "IDNumber=" + IDNumber +
                ", Fee=" + fee +
                ", Grade=" + grade +
                ", Name='" + myName + '\'' +
                ", Age=" + myAge +
                ", Gender='" + myGender + '\'' +
                '}';
    }
}
