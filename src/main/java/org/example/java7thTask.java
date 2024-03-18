package org.example;

public class java7thTask {
    public static void main(String[] args) {

        // 7.	Write a Java Program to print the first 10 numbers of Fibonacci series

        System.out.println("First 10 numbers of the Fibonacci series are ");
        int firstNum=0;
        int secondNum=1;

        System.out.println("The first 10 numbers of the Fibonacci series are ");

        for (int i = 0; i < 10 ; i++) {
            int sum= firstNum+secondNum;
            System.out.print(sum + " ");
            firstNum=secondNum;
            secondNum=sum;

            
        }


    }
}
