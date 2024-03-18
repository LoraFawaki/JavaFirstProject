package org.example;

public class java8thTask {
    public static void main(String[] args) {

        // Maximum and minimum number in the array?

        int [] num={4, 10, 14, 36, 66, 74 ,56 ,48,52,63,70};

        int maxNumber=num[0];

        for (int n:num){
            if (maxNumber<n){
                maxNumber=n;
            }
        }
        System.out.println("The Maximum number in the Array is " + maxNumber);

        int minimumNum=num[0];
        for (int i:num) {
            if (minimumNum>i){
                minimumNum=i;
            }
        }
        System.out.println("The Minimum number in the Array is " + minimumNum);

    }
}
