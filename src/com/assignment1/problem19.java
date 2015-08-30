package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 31/8/15.
 */
public class problem19 {
    public static void main(String[] args) {
        int num, i, f, r, sum = 0, temp;
        System.out.println("Enter a number");
        Scanner reader = new Scanner(System.in);
        num = reader.nextInt();
        temp = num;
        while (num != 0) {
            i = 1;
            f = 1;
            r = num % 10;

            while (i <= r) {
                f = f * i;
                i++;
            }

            sum = sum + f;
            num = num / 10;
        }

        if (sum == temp)
            System.out.println(temp + " is a strong number");
        else
            System.out.println(temp + " is not a strong number");
    }
}
