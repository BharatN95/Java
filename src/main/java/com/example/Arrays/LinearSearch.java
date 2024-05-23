package com.example.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ary = new int[n];

        for(int i = 0; i < n; i++){
            ary[i] = scan.nextInt();
        }

        int key = scan.nextInt();

        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (ary[i] == key) {
                ans = i;
                break;

        }

        System.out.println(ans);

    }
}
