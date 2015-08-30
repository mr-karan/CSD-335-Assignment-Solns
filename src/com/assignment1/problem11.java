package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 31/8/15.
 */
public class problem11 {
    public static void main(String[] args) {

        int d = 0;
        int i = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first num");

        int n1 = reader.nextInt();

        System.out.println("Enter second num");

        int n2 = reader.nextInt();

        if (n1 < n2)

        {
            d = n1;
        } else

        {
            d = n2;
        }


        for (i = d; i > 0; i--)

        {
            if (n1 % i == 0 && n2 % i == 0)

            {

                {

                    System.out.println("GCD is: " + i);

                    break;

                }

            }

        }

    }

}



