package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 31/8/15.
 */
public class problem12 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] total;
        Scanner reader = new Scanner(System.in);
        total = new int[100];
        System.out.println("Enter total numbers");
        int length = reader.nextInt();
        System.out.println("Enter numbers now");
        for (int i = 0; i < length; i++) {
            total[i] = reader.nextInt();
        }
        for (int i = 0; i < length; i++) {
            if (isPrime(total[i])) {
                System.out.println(total[i] + " is a prime number");
            } else {
                System.out.println(total[i] + " is not a prime number");
            }
        }


    }
}
