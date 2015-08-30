package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 31/8/15.
 */
public class problem16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String riman[] = {"M", "XM", "CM", "D", "XD", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int arabian[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int i = 0;
        System.out.println("Enter a number");
        int number = reader.nextInt();
        while (number > 0 || arabian.length == (i - 1)) {
            while ((number - arabian[i]) >= 0) {
                number -= arabian[i];
                result.append(riman[i]);
            }
            i++;
        }
        System.out.println(result.toString());
    }
}
