package com.sanjula.oop.java.tutorials.week_3.Exercise_1;

import com.sanjula.oop.java.tutorials.week_1.Question_2.Circle;
import com.sanjula.oop.java.tutorials.week_3.Exercise_1.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        //Declare and allocate a new instance of cylinder
        Cylinder c1 = new Cylinder();


        System.out.println("Cylinder:" +
                "radius=" + c1.getRadius() +
                "height=" + c1.getHeight() +
                "base are=" + c1.getArea() +
                "volume=" + c1.getVolume());

        //Declare and allocate a new instance of cylinder, specifying the Height
        Cylinder c2 = new Cylinder(5.0);

        System.out.println("Cylinder:" +
                "radius=" + c2.getRadius() +
                "height=" + c2.getHeight() +
                "base are=" + c2.getArea() +
                "volume=" + c2.getVolume());

        //Declare and allocate a new instance of cylinder specifying radius and height
        Cylinder c3 = new Cylinder(5.0, 10.0);

        System.out.println("Cylinder:" +
                "radius=" + c3.getRadius() +
                "height=" + c3.getHeight() +
                "base are=" + c3.getArea() +
                "volume=" + c3.getVolume());

        //Question 4
        Circle circle1 = new Circle(5);
        Cylinder c4 = new Cylinder(5, 10);
        System.out.println("Circle Area: " + circle1.getArea() + "\n"
                + "Cylinder area" + c4.getArea());
    }
}
