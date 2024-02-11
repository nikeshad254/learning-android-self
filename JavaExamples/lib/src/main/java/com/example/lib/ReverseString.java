package com.example.lib;

import java.util.Scanner;

public class ReverseString {
    // reverse the string given
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = s.nextLine();

        System.out.print("Reverse: ");
        for(int i=str.length() -1 ; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
