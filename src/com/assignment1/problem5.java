package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 30/8/15.
 */
public class problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x coordinate of the circle 1 :");

        int x1 = scan.nextInt();

        System.out.println("Enter y coordinate of the circle 1");

        int y1 = scan.nextInt();

        System.out.println("Enter radius of the circle 1");

        int r1 = scan.nextInt();

        System.out.println("Enter x coordinate of the circle 2");

        int x2 = scan.nextInt();

        System.out.println("Enter y coordinate of the circle 2");

        int y2 = scan.nextInt();

        System.out.println("Enter radius of the circle 2");

        int r2 = scan.nextInt();

        int check = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        if (check > (r1 + r2))

        {

            System.out.println("Circles don't overlap at all");

        } else if ((r1 > 2 * r2) && (check < (r1 + r2)))

        {

            System.out.println("Circle 2 lies inside Circle 1");

        } else

        {

            System.out.println("Circle 2 overlaps some part of Circle 1");

        }
    }
}
