package com.mycompany.ass3;

public class Circle {//superclass

    private double radius;
    private String color;

    // empty constructor
    public Circle() {
    }

    // contructor for radius 
    public Circle(double radius) {
        this.radius = radius;
    }

    // constructor for radius and color
    public Circle(double rd, String cl) {
        this.radius = rd;
        this.color = cl;
    }

    //setter method of radius
    public void setRadius(double rd) {
        this.radius = rd;
    }

    //setter method of color
    public void setColor(String cl) {
        this.color = cl;
    }

    // getter method of radius
    public double getRadius() {
        return radius;
    }

    //getter method of color
    public String getColor() {
        return color;
    }

    //method to calculate the area of circle
    public double getarea() {
        return (Math.PI * getRadius() * getRadius()); // the rule of the area of the circle= 3.14*r*r
    }
    //method to return format that have radius and color of each circle

    public String tostring() {
        String m = String.format("[r=%f,color=%s]", getRadius(), getColor());
        return m;

    }

}
