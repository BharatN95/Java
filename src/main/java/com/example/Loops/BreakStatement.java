package com.example.Loops;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                System.out.println("Breaking the Statement");
                break;
            }
            System.out.println(i);
        }
    }
}
