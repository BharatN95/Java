package com.example.Loops;

import java.util.Scanner;

public class WhileCountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digits = 0;

        while (num > 0){
           num /= 10;
           digits++;
        }
        System.out.println(digits);
    }
}
