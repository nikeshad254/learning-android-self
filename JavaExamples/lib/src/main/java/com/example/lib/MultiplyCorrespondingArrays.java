package com.example.lib;

public class MultiplyCorrespondingArrays {
    // multiply corresponding elements form two integer array
    // [1, 2, 3] * [1 , 2, 3] ==> [1, 4, 9]
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};

        int result[] = new int[3];

        System.out.println("Multiplied: ");
        for(int i=0; i<arr1.length ; i++){
            result[i] = arr1[i] * arr2[i];
            System.out.print(result[i] + " ,");
        }

    }
}
