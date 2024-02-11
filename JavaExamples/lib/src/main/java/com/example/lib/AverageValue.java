package com.example.lib;

import java.util.Scanner;

public class AverageValue {
    // find average value of an array
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter lenght of array: ");
        int len = s.nextInt();

        int numbers[] = new int[len];

        System.out.println("Enter values of array: ");
        for(int i=0; i<len; i++){
            System.out.print("a"+i+": ");
            numbers[i] = s.nextInt();
        }

        int sum=0;
        for(int i=0; i<len; i++){
            sum += numbers[i];
        }

        System.out.println("Average in array is: "+ (float)sum/len);
    }
}
