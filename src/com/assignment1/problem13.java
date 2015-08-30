package com.assignment1;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by karan on 31/8/15.
 */
public class problem13 {
    public static void main(String[] args) {
        int[] total;
        Scanner reader = new Scanner(System.in);
        total = new int[100];
        System.out.println("Enter total numbers");
        int length = reader.nextInt();
        for (int i = 0; i < length; i++) {
            total[i] = reader.nextInt();
        }
        List b = Arrays.asList(ArrayUtils.toObject(total));
        for (int i = 0; i < length; i++) {
            int occurrences = Collections.frequency(b, total[i]);
            System.out.println(occurrences + "Student(s) scored " + total[i] + " Marks");
        }


    }
}
