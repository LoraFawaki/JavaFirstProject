package org.example;

public class java5thTask {
    public static void main(String[] args) {
        /*
5.	Write a program to swap 2 numbers without a temporary variable?
         */

        int num1=15;
        int num2=25;

        num1 = num2 + num1;
        num2 = num1 -num2;
        num1 = num1 - num2;

        System.out.println(num1);
        System.out.println(num2);



    }
}
