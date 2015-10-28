package com.SNU.geometryUtil;

/**
 * Created by karan on 28/10/15.
 */
public class circle {

    // circle class has one  field
    public double radius;

    // circle class has one constructor
    public circle(double r) {
        this.radius = r;
    }

    //circle class has two methods
    public double getPerimeter() {
       return 2*Math.PI*radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }



}