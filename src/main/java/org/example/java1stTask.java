package org.example;

public class java1stTask {
    public static void main(String[] args) {

        //Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.

        double [] temp={66.6,74,56.5,48,52,63,70};
        double maxtemp=temp[0];
        for (double n:temp){
            if (maxtemp<n){
                maxtemp=n;

            }
        }
        System.out.println("highest temperature for the week is " + maxtemp);
        double lowtemp=temp[0];
        for (double i:temp) {
            if (lowtemp>i){
                lowtemp=i;
            }
        }
        System.out.println("lowest temperature for the week is " + lowtemp);


           }
}
