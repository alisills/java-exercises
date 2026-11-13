package com.amigoscode._1_beginners;

/**
 * Exercise: Strings
 *
 * Learn how to work with Strings in Java.
 * Strings are objects that represent sequences of characters and come with
 * many useful built-in methods.
 */
public class _8_StringExercises {

    public static void main(String[] args) {

        String message = "Hello, Welcome to Amigoscode!";
        String padded = "   Hello World   ";
        String csv = "apple,banana,cherry,date,elderberry";

        // TODO: 1 - Get the length of the 'message' string and print it
        // Hint: Use the .length() method
        IO.println(message.length());
        IO.println();
        // TODO: 2 - Convert 'message' to uppercase and lowercase, and print both
        // Hint: Use .toUpperCase() and .toLowerCase()
        IO.println(message.toUpperCase());
        IO.println(message.toLowerCase());
        IO.println();
        // TODO: 3 - Get a substring of 'message' containing the first 5 characters and print it
        // Hint: Use .substring(startIndex, endIndex)
        IO.println(message.substring(0, 5));
        IO.println();
        // TODO: 4 - Check if 'message' contains the word "Amigoscode" and print the result
        // Hint: Use .contains()
        IO.println(message.contains("Amigoscode"));
        IO.println();
        // TODO: 5 - Replace "Amigoscode" with "Java" in 'message' and print the new string
        // Hint: Use .replace(oldValue, newValue)
        IO.println(message.replace("Amigoscode", "Java"));
        IO.println();
        // TODO: 6 - Trim the whitespace from the 'padded' string and print the result
        // Hint: Use .trim()
        IO.println(padded.trim());
        IO.println();
        // TODO: 7 - Split the 'csv' string by commas into a String array and print each element
        // Hint: Use .split(",") then loop through the resulting array
        String[] letters = csv.split(",");
        for (int i = 0; i < letters.length; i++) {
            IO.println(letters[i]);
        } // cleared the extension error by replacing csv.length with letters.length
        IO.println();
        // TODO: 8 - Check if two strings are equal using .equals() (not ==)
        // Create two String variables with the same text content and compare them.
        // Print the result of .equals() and explain why == may not work for Strings.
        String firstName = "Sillw";
        String lastName = "Sills";
        IO.println(firstName.equals(lastName)); // It does not equal do to the binary not matching.
    }
}
