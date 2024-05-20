package com.example.Operators;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Value = scan.nextInt();

        if (Value > 0){
            System.out.println("Positive Number");
        } else if (Value < 0) {
            System.out.println("Negative Number");
        }else{
            System.out.println("Value is Zero");
        }

    }
}
