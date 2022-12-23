package com.mycompany.ass3;

public class Ass3 {

    public static void main(String[] args) {
        //create object of circle 
        Circle c = new Circle(4, "blue");

        //print tostring and getarea method
        System.out.println(c.tostring());
        System.out.println(c.getarea());

        //create another object of cylinder
        Cylinder c1 = new Cylinder(6, 4, "blue");

        //print tostring and getvolume method 
        System.out.println(c1.tostring());
        System.out.println(c1.getvolume());
    }
}
