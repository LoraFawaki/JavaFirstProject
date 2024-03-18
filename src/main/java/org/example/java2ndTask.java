package org.example;

public class java2ndTask {
    public static void main(String[] args) {

        // Create an array of integer values. After the array is created, calculate the sum of all
        // stored elements in that array.

        int [] num={19,3,4,14,25,23};
        int sum=0;
        for (int n:num){
            sum+=n;

        }
        System.out.println("The sum of all elements store in the arrays is " + sum);
    }
}
