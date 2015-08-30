package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 31/8/15.
 */
public class problem10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of seconds please");
        int seconds = reader.nextInt();
        for (int i = 1; i <= seconds; i++)

        {

            try

            {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("Message " + i);

        }
    }
}
