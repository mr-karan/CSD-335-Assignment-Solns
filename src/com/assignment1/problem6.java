package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 30/8/15.
 */
public class problem6 {
    public static void toBase(int number) {
        String binary = "";
        int temp = number / 2 + 1;
        for (int j = 0; j < temp; j++) {
            try {
                binary += "" + number % 2;

                number /= 2;
            } catch (Exception e) {
            }
        }
        for (int j = binary.length() - 1; j >= 0; j--) {
            System.out.print(binary.charAt(j));
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        toBase(num);

    }
}
