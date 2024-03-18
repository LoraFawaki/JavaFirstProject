package org.example;

public class java3rdTask {
    public static void main(String[] args) {

        // Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.

        int [] [] num= {
                {10, 23, 41, 50},
                {22, 42, 97, 65},
                {15, 50, 33, 31},
        };

        for (int[] ints : num) { //for rows
            for (int anInt : ints) { // for columns
                if (anInt % 2 == 0) {
                    System.out.println(anInt);
                }

            }
        }


    }
}
