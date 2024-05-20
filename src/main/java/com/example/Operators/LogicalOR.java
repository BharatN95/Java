package com.example.Operators;

public class LogicalOR {
    public static void main(String[] args) {
        String organ = "Scaler";

        if (organ == "Scaler" || organ == "InterviewBit"){
            System.out.println("User is permitted");
        }else {
            System.out.println("User is Blocked");
        }
    }
}
