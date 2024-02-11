package com.example.lib;

public class CountEvenOdd {
    // count even and odd numbers from given array
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5,6, 7};
        int oddCount=0, evenCount=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Odds: "+ oddCount+ " Even: "+ evenCount);
    }
}
