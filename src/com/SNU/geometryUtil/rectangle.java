package com.SNU.geometryUtil;

/**
 * Created by karan on 28/10/15.
 */
public class rectangle {

    // rectangle class has two  fields
    public double length;
    public double breadth;

    // rectangle class has one constructor
    public rectangle(double l,double b) {
        this.length = l;
        this.breadth = b;
    }

    //rectangle class has two methods
    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public double getArea(double height) {
        return length * breadth;
    }



}