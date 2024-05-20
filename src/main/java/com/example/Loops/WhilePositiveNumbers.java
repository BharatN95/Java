package com.example.Loops;

import java.util.Scanner;

public class WhilePositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            num = scan.nextInt();
            sum += num;
        } while (num >= 0);
        System.out.println("Sum =" + sum);
    }
}
