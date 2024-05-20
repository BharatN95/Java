package com.example.Operators;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        switch (month){
            case 1:
                System.out.println("January");
                System.out.println("31 Days");
                break;
            case 2:
                System.out.println("Febuary");
                System.out.println("31 Days");
                break;
            case 3:
                System.out.println("Mar");
                System.out.println("31 Days");
                break;
            case 4:
                System.out.println("Jun");
                System.out.println("28 Days");
                break;
            case 5:
                System.out.println("July");
                System.out.println("26 Days");
                break;
            default:{
                System.out.println("Invalid Month Number");
            }
        }


    }
}
