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

        for (int i=0; i<num.length; i++){ //for rows
            for (int j=0; j< num[i].length; j++){ // for columns
                if (num[i][j] % 2 == 0){
                    System.out.println(num[i][j]);
                }

            }
        }


    }
}
