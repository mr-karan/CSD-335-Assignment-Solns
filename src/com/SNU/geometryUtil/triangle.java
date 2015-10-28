package com.SNU.geometryUtil;

/**
 * Created by karan on 28/10/15.
 */
public class triangle {

    // triangle class has three fields
    public double sideA;
    public double sideB;
    public double sideC;

    // triangle class has one constructor
    public triangle(double a,double b,double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    //triangle class has two methods
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }

    public double getArea(double height) {
        return (height*sideB)/2;
    }



}