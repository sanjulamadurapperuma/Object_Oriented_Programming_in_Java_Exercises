package com.sanjula.oop.java.tutorials.week_1.Question_2;

public class TestCircle {
    public static void main(String[] args) {
        //Declare a new Circle object circle1 and invoke the default constructor.
        Circle circle1 = new Circle();

        circle1.setRadius(4);
        circle1.setColour("Red");

        //Invoke the public methods
        System.out.println("Circle 1 has radius of " + circle1.getRadius() + " and area of " +
                circle1.getArea() + " and its colour is " + circle1.getColour());

        //Declare a second Circle object circle2 and invoke the second constructor.
        Circle circle2 = new Circle(8);

        circle2.setRadius(6);
        circle2.setColour("Grey");

        //Invoke the public methods
        System.out.println("Circle 2 has radius of " + circle2.getRadius() + " and area of " +
                circle2.getArea() + " and its colour is " + circle2.getColour());

        //Question_13
        System.out.println("Circle 1 radius: " + circle1.getRadius());

        circle1.setRadius(10);

        Circle circle3 = new Circle(10, "yellow");

        System.out.println("Circle 3 has radius of " + circle3.getRadius() + " and area of " +
                circle3.getArea() + " and its colour is " + circle3.getColour());

        System.out.println(circle3.toString());
        System.out.println(circle3);

    }
}
