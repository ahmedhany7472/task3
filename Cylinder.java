package com.mycompany.ass3;

public class Cylinder extends Circle {//subclass from circle

    private double height;

    //empty constractor
    public Cylinder() {

    }

    //  constractor of height
    public Cylinder(double ht) {
        this.height = ht;

    }

    // constractor OF height and radius
    public Cylinder(double ht, double rd) {
        super(rd);
        this.height = ht;
    }
    // constractor OF height , radius ,and color 

    public Cylinder(double ht, double rd, String cl) {
        super(rd, cl);
        this.height = ht;

    }

    // setter method of height
    public void setHeight(double ht) {
        this.height = ht;
    }

    // getter method of height
    public double getHeight() {
        return height;
    }

    // getter method to get the valume of the cylinder
    public double getvolume() {
        // the rule of the valume of the cylinder = 3.14*r*r*h
        return (Math.PI * super.getRadius() * super.getRadius() * getHeight());
    }

    @Override
    //to return format that have height, radius and color of each cylinder
    public String tostring() {
        String m = String.format("[h=%f,r=%f,color=%s]", getHeight(), super.getRadius(), super.getColor());
        return m;

    }

}
