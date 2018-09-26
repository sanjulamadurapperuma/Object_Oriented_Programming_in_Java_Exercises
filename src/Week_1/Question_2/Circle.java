package Week_1.Question_2;

public class Circle {
    private String colour;
    private double radius;

    //Default constructor
    public Circle(){
        this.radius = 1;
        this.colour = "Blue";
    }

    //Second constructor
    public Circle(double r){
        this.radius = r;
        this.colour = "Blue";
    }

    //Third constructor
    public Circle(double r, String c){
        this.radius = r;
        this.colour = c;
    }

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
