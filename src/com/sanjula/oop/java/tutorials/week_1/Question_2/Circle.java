/*File: Circle.java
* Description: Contains properties of a circle and its getters and setters */

package com.sanjula.oop.java.tutorials.week_1.Question_2;

/**
 * This is a model class to hold phone information
 *
 * @see java.lang.Object
 * @author Sanjula Madurapperuma
 */
public class Circle {
    private String colour;
    private double radius;

    /**
     * No-argument constructor initializes instance variables
     * to null
     * @see #setRadius(double)
     * @see #setColour(String)
     */
    public Circle(){
        this.radius = 1;
        this.colour = "Blue";
    }

    /**
     * Phone constructor
     * @param r is the radius
     * @see #setRadius(double)
     */
    public Circle(double r){
        this.radius = r;
        this.colour = "Blue";
    }

    /**
     * Phone constructor
     * @param r is the radius
     * @see #setRadius(double)
     * @see #setColour(String)
     */
    public Circle(double r, String c){
        this.radius = r;
        this.colour = c;
    }

    /**
     * Gets the radius
     * @return a <code> double </code>
     * specifying the area code
     */
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

    @Override
    public String toString() {
        return "Radius of circle " + getRadius() + ",\n"
                + "Area of circle " + getArea() + ", \n"
                + "Colour of circle " + getColour() + "\n"
                 + "-------------------------------------\n";
    }
}
