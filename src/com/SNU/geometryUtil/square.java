package com.SNU.geometryUtil;

/**
 * Created by karan on 28/10/15.
 */
public class square{

    // sqaure class has one field
    public double side;

    // sqaure class has one constructor
    public square(double s) {
        this.side = s;

    }

    //square class has two methods
    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }



}