package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 31/8/15.
 */
public class problem17 {
    public static void main(String[] args) {

        int n, sum = 0, temp, remainder, digits = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number");
        n = reader.nextInt();

        temp = n;

        // Count number of digits

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;

        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }

        if (n == sum)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }

    static int power(int n, int r) {
        int c, p = 1;

        for (c = 1; c <= r; c++)
            p = p * n;

        return p;
    }
}
