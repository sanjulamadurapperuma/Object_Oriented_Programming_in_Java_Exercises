package com.sanjula.oop.java.tutorials.week_3.Exercise_2;

public class Test2 {
    public static void main(String[] args) {
        Person person1 = new Person("John Smith", 42, "M");
        System.out.println(person1);
        Student person2 = new Student("Kate Washington", 21, "F",122233,5000,12);
        System.out.println(person2);
        Teacher person3 = new Teacher("Sam Hamilton", 34, "M",50000 ,"Computer Science");
        System.out.println(person3);
    }
}
