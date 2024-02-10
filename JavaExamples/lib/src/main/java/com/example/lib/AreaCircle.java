package com.example.lib;

import java.util.Scanner;

public class AreaCircle {
    public static  void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Input radius: ");
        float r = s.nextInt();

        double area =  3.14 * r * r;
        double perimeter = 2 * 3.14 * r;

        System.out.println("Area: "+ area+ " Perimeter: "+ perimeter);
    }
}
