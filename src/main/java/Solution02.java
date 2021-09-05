/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution 02
 * Copyright 2021 Tyler King
 */

import java.util.Scanner;                                           // Import declaration for class scanner

public class Solution02 {
    public static void main(String[] args) {                        // Main method
        String userInput;                                           // String declaration variable
        Scanner input = new Scanner(System.in);                     // Enable program to read User data
        System.out.print("What is the input string? ");             // Prompt user for a string variable (random word)
        userInput = input.nextLine();                               // Sets user input into myName string variable
        int length = userInput.length();                            // Sets user input into length integer variable
        if(userInput.length()==0) {                                 // Determine if there was no iput from user
            System.out.print("Enter something other than nothing"); // Print message asking user for input
        }
        if(userInput.length()>0) {                                  // Condition for actual input from user
            System.out.print(userInput + " has " + length + " characters.");    // Print statement for users input and
        }                                                                       // character length of said input
    }
}
