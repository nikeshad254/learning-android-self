package com.example.lib;

import java.util.Scanner;

public class AddTwoMatrices {
    // adding two matrices of same size
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int row = s.nextInt();

        System.out.print("Enter no of cols: ");
        int col = s.nextInt();

        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];

        System.out.println("Enter num for first matrix m * n");
        for (int m=0; m<row; m++){
            for(int n=0; n<col; n++){
                System.out.print((m+1) + " x "+ (n+1) + ": ");
                mat1[m][n]= s.nextInt();
            }
        }

        System.out.println("Enter num for second matrix m * n");
        for (int m=0; m<row; m++){
            for(int n=0; n<col; n++){
                System.out.print((m+1) + " x "+ (n+1) + ": ");
                mat2[m][n]= s.nextInt();
            }
        }


        for (int m=0; m<row; m++){
            for(int n=0; n<col; n++){
                res[m][n] = mat1[m][n] + mat2[m][n];
            }
        }

        System.out.println("Result of sum is: ");
        for (int m=0; m<row; m++){
            for(int n=0; n<col; n++){
                System.out.print(res[m][n] + "\t");
            }
            System.out.println();
        }
    }
}
