package com.example.Operators;

import java.util.Scanner;

public class SwitchProblem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);

//        switch (ch){
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println("Vowel");
//                break;
//            default:{
//                System.out.println("Consonant");
//            }
//        }

        // Enhanced
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> {
                System.out.println("Consonant");
            }
        }


    }
}
