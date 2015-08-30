package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 30/8/15.
 */
public class problem3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int sum = 0;
        int a = 0;
        while (num != 0) {
            a = num % 10;
            num = num / 10;
            sum = sum + a;


        }
        System.out.println(sum);
    }
}
