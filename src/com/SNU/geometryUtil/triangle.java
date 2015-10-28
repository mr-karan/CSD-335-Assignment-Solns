package com.SNU.geometryUtil;

import java.util.Scanner;

/**
 * Created by karan on 28/10/15.
 */
public class triangle {

    // triangle class has three fields
    public double sideA;
    public double sideB;
    public double sideC;
    static int count=0;
    // triangle class has one constructor

    public triangle(){
        this.sideA=3;
        this.sideB=4;
        this.sideC=5;
        count++;
    }
    public triangle(double a,double b,double c) throws IllegalTriangleException {
        if ((sideA + sideB < sideC) || (sideB + sideC < sideA) || (sideA + sideC < sideB)) {
            throw new IllegalTriangleException("Sum of two sides should be greater than the third one.");
        } else {
            this.sideA = a;
            this.sideB = b;
            this.sideC = c;
            count++;

        }
    }
    public double getSide1(){
        return this.sideA;
    }

    public double getSide2(){
        return this.sideB;
    }

    public double getSide3(){
        return this.sideC;
    }

    //triangle class has two methods
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }


    public void setDimensions() throws IllegalTriangleException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        this.sideA = input.nextDouble();
        System.out.print("Enter side 2: ");
        this.sideB = input.nextDouble();
        System.out.print("Enter side 3: ");
        this.sideC = input.nextDouble();
        if((sideA+sideB < sideC) || (sideB+sideC < sideA) || (sideA+sideC < sideB)){
            throw new IllegalTriangleException("Sum of two sides should be greater than the third one.");
        }
    }



    public double getArea(){
        double s = (this.sideA+this.sideB+this.sideC)/2;
        return Math.pow((s*(s-sideA)*(s-sideB)*(s*sideC)), 0.5);
    }


    public int returnObjects(){
        return count;
    }





}