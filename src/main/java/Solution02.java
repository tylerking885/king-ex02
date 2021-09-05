/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Tyler King
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        String userInput;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        userInput = input.nextLine();
        int length = userInput.length();
        if(userInput.length()==0) {
            System.out.print("Enter something other than nothing");
        }
        if(userInput.length()>0) {
            System.out.print(userInput + " has " + length + " characters.");
        }
    }
}
