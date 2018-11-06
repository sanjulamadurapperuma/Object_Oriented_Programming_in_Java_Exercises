package com.sanjula.oop.java.tutorials.week_4;

public class Square extends GeometricObject{
    protected double side;

    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getShape() {
        return "Square";
    }
}
