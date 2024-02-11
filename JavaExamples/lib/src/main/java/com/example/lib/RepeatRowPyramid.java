package com.example.lib;

import java.util.Scanner;

public class RepeatRowPyramid {
    // make pyramid pattern where row repeats its row number
    /*
    *     1
    *   2   2
    * 3   3   3
    * */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("No of rows: ");
        int numRows = s.nextInt();

        int space = numRows -1;

        for(int i=1; i<=numRows; i++){
            for(int j=space; j!=0; j--){
                System.out.print(" ");
            }

            for(int j=0; j<i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
            space--;
        }
    }
}
