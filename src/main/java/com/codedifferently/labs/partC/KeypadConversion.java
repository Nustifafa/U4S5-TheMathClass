package com.codedifferently.labs.partC;

import java.util.Scanner;  // Import Scanner class

public class KeypadConversion {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a message
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();

        // Initialize an empty string to store the result
        StringBuilder result = new StringBuilder();

        // Mapping letters to corresponding keypresses on the telephone keypad
        for (char ch : message.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'c') {
                result.append("2");
            } else if (ch >= 'd' && ch <= 'f') {
                result.append("3");
            } else if (ch >= 'g' && ch <= 'i') {
                result.append("4");
            } else if (ch >= 'j' && ch <= 'l') {
                result.append("5");
            } else if (ch >= 'm' && ch <= 'o') {
                result.append("6");
            } else if (ch >= 'p' && ch <= 's') {
                result.append("7");
            } else if (ch >= 't' && ch <= 'v') {
                result.append("8");
            } else if (ch >= 'w' && ch <= 'z') {
                result.append("9");
            } else {
                // Skip any non-letter characters (e.g., spaces, punctuation)
                continue;
            }
        }

        // Output the result
        System.out.println("Keypress sequence: " + result.toString());

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}