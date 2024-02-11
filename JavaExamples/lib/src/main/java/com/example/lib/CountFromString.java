package com.example.lib;

import java.util.Scanner;

public class CountFromString {
    // count letter, space and number in string
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = s.nextLine();

        int countLettter=0, countSpace=0, countNumber=0,countOther=0;
        for(int i =0; i<str.length(); i++){
            char letter = str.charAt(i);
            if(Character.isLetter(letter)){
                countLettter++;
            } else if (Character.isDigit(letter)) {
                countNumber++;
            }
            else if (Character.isSpaceChar(letter)){
                countSpace++;
            }else{
                countOther++;
            }
        }

        System.out.println("Counts are => ");
        System.out.println("Letter: "+ countLettter);
        System.out.println("Spaces: "+ countSpace);
        System.out.println("Number: "+ countNumber);
        System.out.println("Others: "+ countOther);

    }
}
