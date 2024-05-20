package com.example.Operators;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        String ans = value % 2 == 0 ? "Even" : "Odd";

        System.out.println(ans);

    }

}
