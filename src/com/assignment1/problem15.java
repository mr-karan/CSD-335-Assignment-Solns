package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 31/8/15.
 */
public class problem15 {
    public static void main(String[] args) {
        int number, rev = 0;

        System.out.println("Enter the number to reverse");
        Scanner reader = new Scanner(System.in);
        number = reader.nextInt();

        while (number != 0) {
            rev = rev * 10;
            rev = rev + number % 10;
            number = number / 10;
        }

        System.out.println("Reverse of entered number is " + rev);
    }
}
