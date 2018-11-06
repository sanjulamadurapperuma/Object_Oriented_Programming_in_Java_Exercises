package com.sanjula.oop.java.tutorials.week_4;

public abstract class GeometricObject {
    protected String colour;
    protected boolean filled;

    public GeometricObject(){

    }

    public GeometricObject(String colour,  boolean filled){
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract String getShape();
}
