package org.example;

public class jave10thTask {
    public static void main(String[] args) {

        // 10.	Write a program to print out duplicate elements from an Array of Strings

        int [] num={4, 10, 14, 36, 66, 74 ,56, 14 ,48,52,63,70};
        for (int i = 0; i < num.length ; i++) {
            for (int j = i+1 ; j < num.length ; j++) {
                if (num[i]==num[j]){
                    System.out.println(num[j]);
                }

            }
        }
            
        }

}
