package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 30/8/15.
 */
public class problem4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int hcf = 0;
        int lcm = 0;
        int n1 = reader.nextInt();
        int n2 = reader.nextInt();
        int min = Math.min(n1, n2);

        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
                break;
            }
        }
        for (int i = n1; i <= n1 * n2; i++) //Even if you start the for loop by 1, you will get the answer, but starting it from either the first or the second number reduces the number of times the for loop is executed.
        {
            if (i % n1 == 0 && i % n2 == 0) //Checking the first number which is divisible by both the numbers
            {
                lcm = i;
                break; //exiting from the loop, as we don’t need anymore checking after getting the LCM
            }
        }
        System.out.println("LCM is " + lcm);
        System.out.println("HCF is " + hcf);
    }
}
