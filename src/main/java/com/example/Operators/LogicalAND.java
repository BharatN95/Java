package com.example.Operators;

public class LogicalAND {
    public static void main(String[] args) {
        int age = 24;
        String citizenship = "Indian";

        if (age >= 18 && citizenship == "Indian"){
            System.out.println("Person may vote");
        }else{
            System.out.println("Person Can't vote");
        }

    }
}
