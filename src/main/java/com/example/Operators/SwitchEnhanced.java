package com.example.Operators;

import java.util.Scanner;

public class SwitchEnhanced {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        switch (month){
            case 1 -> {
                System.out.println("January");
                System.out.println("31 Days");
            }
            case 2 -> {
                System.out.println("Feb");
                System.out.println("31 Days");
            }
            case 3 -> {
                System.out.println("Mar");
                System.out.println("31 Days");
            }
            default->{
                System.out.println("Invalid Month Number");
            }
        }


    }

}
