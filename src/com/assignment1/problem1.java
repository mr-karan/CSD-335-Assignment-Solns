package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 29/8/15.
 */
public class problem1{
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter side 1");
        int side1=reader.nextInt();
        System.out.println("Enter side 2");
        int side2=reader.nextInt();
        System.out.println("Enter side 3");
        int side3=reader.nextInt();
        if (side1+side2>side3 || side2+side3>side1 || side1+side3>side2){
            System.out.println("Input Valid");
        }
        else{
            System.out.println("Input invalid");
        }
    }
}
