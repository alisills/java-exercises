package com.amigoscode._1_beginners;

/**
 * Exercise: Conditional Statements
 *
 * Learn how to control the flow of your program using if/else and switch statements.
 * Conditional statements allow your program to make decisions based on conditions.
 */
public class _4_ConditionalStatements {

    public static void main(String[] args) {

        // TODO: 1 - Write an if statement that prints "Positive" if a number is greater than 0
        // Declare an int variable called number and assign it a positive value.

        int number = 0;
        if (number > 0) {
            IO.println("Positive");
        }

        // TODO: 2 - Add an else clause to the above that prints "Not positive"
        // Change the value of number to a negative value or 0 to test both branches.
        else {
            IO.println("Not positive");
        }

        // TODO: 3 - Write an if/else if/else chain for grade classification
        // Declare an int variable called score and assign it a value (0-100).
        // If score >= 90, print "Grade: A"
        // Else if score >= 80, print "Grade: B"
        // Else if score >= 70, print "Grade: C"
        // Else print "Grade: F"

        int score = 85;
        if (score >= 90) {
            IO.println("Grade: A");
        } else if (score >= 80) {
            IO.println("Grade: B");
        } else if (score >= 70) {
            IO.println("Grade: C");
        } else {
            IO.println("Grade: F");
        }

        IO.println();

        // TODO: 4 - Write a switch statement for day of the week
        // Declare an int variable called day (1-7).
        // Use a switch statement to print the day name:
        //   1 -> "Monday", 2 -> "Tuesday", ... 7 -> "Sunday"
        // Include a default case for invalid values.

        int day = 3;
        String dayname = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Day does not exist. Pick a number 1 - 7";
        };

        IO.println(dayname);
        IO.println();

        // TODO: 5 - Use a switch statement with a String
        // Declare a String variable called month (e.g., "February").
        // Use a switch statement to print the number of days in that month.
        // Handle at least 3-4 months plus a default case.

        String month = "February";
        String dayOfMonth = switch (month) {
            case "January" -> "31 days";
            case "February" -> "29 days";
            case "March" -> "31 days";
            case "April" -> "30 days";
            default -> "That month does not exist";
        };
        IO.println(dayOfMonth);
        IO.println();

        // TODO: 6 - Use a switch expression (Java 14+) to return a value
        // Using the 'day' variable from above, assign the day name to a String
        // using a switch expression with arrow syntax:
        //   String dayName = switch (day) {
        //       case 1 -> "Monday";
        //       ...
        //   };
        // Print the result.
        String newDay = String.valueOf((int) day);
        String dayName = switch (newDay) {
            case "1" -> "Monday";
            case "2" -> "Tuesday";
            case "3" -> "Wednesday";
            case "4" -> "Thursday";
            case "5" -> "Friday";
            case "6" -> "Saturday";
            case "7" -> "Sunday";
            default -> "Day does not exist. Pick a number 1 - 7";
        };

        IO.println(dayName);
        IO.println();

        // TODO: 7 - Write a nested if statement to check if a number is positive AND even
        // Declare an int variable called value.
        // First check if it is positive (> 0).
        //   If positive, check if it is even (value % 2 == 0).
        //     If even, print "Positive and even"
        //     Else print "Positive and odd"
        //   Else print "Not positive"

        int value = 8;
        IO.println(value > 0);
        if (value > 0) {
            if (value % 2 == 0) {
                IO.println("Positive and even");
            } else {
                IO.println("Positive and odd");
            }
        } else {
            IO.println("Not positive");
        }

    }
}
