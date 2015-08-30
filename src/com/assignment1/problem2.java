package com.assignment1;

import java.util.Scanner;

/**
 * Created by karan on 30/8/15.
 */
public class problem2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            int ascii = (int) a;
            System.out.println(ascii);
        }
    }
}
