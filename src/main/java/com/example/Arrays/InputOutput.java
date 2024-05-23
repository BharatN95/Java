package com.example.Arrays;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

/*
        int[] marks = new int[15];

        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        marks[5] = 60;

        System.out.println(4);


        float[] flt = new float[8];
        System.out.println(flt[5]);

        String[] names = {"Bharat", "Ram", "Pushpak"};
        System.out.println(names[2]);
        System.out.println(names[0]);

        System.out.println(names.length);

 */

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] ary = new int[n];


        // Input Loop
        for (int i = 0; i < ary.length; i++){
            ary[i] = scan.nextInt();
        }

        // Output Loop
        for (int i = 0; i < ary.length; i++){
            System.out.println("At Index " + i + " the value is " + ary[i]);
        }


    }
}
