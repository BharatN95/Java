package com.example.Loops;
import java.util.Scanner;

public class ForLoops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++){
            int current = scan.nextInt();
            maxValue = Math.max(maxValue, current);
        }
        System.out.println(maxValue);
    }
}
