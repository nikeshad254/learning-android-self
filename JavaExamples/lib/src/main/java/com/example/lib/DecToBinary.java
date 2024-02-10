package com.example.lib;

import java.sql.Array;
import java.util.Scanner;

public class DecToBinary {
    // for decimal number given by user convert to binary format
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int decNum = s.nextInt();

        int i=0,j, quot=decNum;
        int binArr[] = new int[100];
        while(quot != 0){
            binArr[i] = quot%2;
            quot=quot/2;
            i++;
        }

        System.out.print("\nBinary number is: ");
        for (j=i-1;j>=0;j--){
            System.out.print(binArr[j]);
        }

        System.out.println();
    }
}
