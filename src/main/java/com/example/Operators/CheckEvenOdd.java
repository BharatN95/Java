package com.example.Operators;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        if (value % 2 == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
}
