package com.assignment1;

/**
 * Created by karan on 31/8/15.
 */
public class problem18 {
    public static void main(String[] args) {
        int i, j, k = 0;

        for (i = 10; i > 0; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            int z = (11 - i) % 10;
            for (k = 1; k <= (2 * (11 - i) - 1); k++) {

                System.out.print(z % 10);
                if (k <= (((2 * (11 - i) - 1) / 2))) {
                    z++;
                } else {
                    z--;
                }
            }
            System.out.println();

        }
    }
}
