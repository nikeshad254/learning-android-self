package com.example.lib;


import java.util.Scanner;

public class Ex1 {
    // write a program that gets 2 number from user and display its division and reminder
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = s1.nextInt();

        System.out.println("Enter your first number: ");
        int num2 = s1.nextInt();

        float division = (float) num1 / num2;
        int remainder = num1 % num2;

        System.out.println("for n1/n2 Division is : "+division+ " and remainder is: "+ remainder);
    }
}
