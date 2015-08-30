package com.assignment1;

/**
 * Created by karan on 31/8/15.
 */
public class problem8 {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        // Math.random() returns a value between 0.0 and 1.0
        // so it is heads or tails 50% of the time
        for (int i = 0; i < 1000000; i++) {
            if (Math.random() < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Heads :" + heads);
        System.out.println("Tails : " + tails);
    }
}
