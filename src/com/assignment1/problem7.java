package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 31/8/15.
 */
public class problem7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number (Decimal) ");
        int num = reader.nextInt();

        int remainder = 0;

        String hexadecimal = new String("");

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (num > 0) {
            remainder = num % 16;
            hexadecimal = hex[remainder] + hexadecimal;
            num = num / 16;
        }
        System.out.println(" Hexadecimal: " + hexadecimal);
    }
}
