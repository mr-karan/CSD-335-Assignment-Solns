package com.assignment1;

/**
 * Created by karan on 31/8/15.
 */
public class problem14 {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        //PATTERN1
        System.out.println("Pattern 1");
        for (i = 0; i < 5; i++)        //5*5
        {
            for (j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //PATTERN2
        System.out.println("Pattern 2");
        System.out.println();
        for (i = 5; i > 0; i--) {
            for (j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //PATTERN3
        System.out.println("Pattern 3");

        System.out.println();
        for (i = 1; i <= 5; i++) {
            for (j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}

