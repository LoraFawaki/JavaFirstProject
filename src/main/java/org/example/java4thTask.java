package org.example;

public class java4thTask {
    public static void main(String[] args) {

     /*
    4.	Create a 2D array of integers. Develop a program which will calculate the
    sum of even and odd numbers for that array
     */
        int [] [] num={
                {10, 13, 17, 19},
                {22, 25, 28, 23},
                {31, 34, 46, 37},
                {44, 46, 48, 47},
                {51, 54, 56, 58}
        };
        int sumOdd=0;
        int sumEven=0;
        for (int i = 0; i < num.length; i++) { //for rows
            for (int j = 0; j <num [i].length; j++) { //for columns
                if (num[i][j] %2 != 0) {
                    sumOdd+= num[i][j];
                }else if (num[i][j] %2 == 0);
                sumEven+=num[i][j];
            }
        }
        System.out.println("Sum of even numbers is "+ sumEven);
        System.out.println("Sum of odd numbers is "+ sumOdd);
    }
}
