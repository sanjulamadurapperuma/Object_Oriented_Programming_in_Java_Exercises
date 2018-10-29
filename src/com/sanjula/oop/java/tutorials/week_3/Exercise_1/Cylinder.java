package com.sanjula.oop.java.tutorials.week_3.Exercise_1;

import com.sanjula.oop.java.tutorials.week_1.Question_2.Circle;

public class Cylinder extends Circle {
    private double height;

    //Constructor with default color, radius and height
    public Cylinder(){
        super();
        height = 1.0;
    }

    //Constructor with default radius, color but given height
    public Cylinder(double height){
        super();
        this.height = height;
    }

    //Constructor with default color, but given radius, height
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    //A public method for retreiving the height
    public double getHeight(){
        return height;
    }

    //A public method for computing the volume of cylinder
    //use superclass method getArea() to get the base area
    public double getVolume(){
        double volume = getArea()*height;
        return volume;
    }

    @Override
    public double getArea(){
        return 2 * Math.PI * getRadius() * getHeight() + super.getArea() * 2;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + "height= " + height;
    }
}



