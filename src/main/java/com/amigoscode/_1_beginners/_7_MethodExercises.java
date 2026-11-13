package com.amigoscode._1_beginners;

/**
 * Exercise: Methods
 *
 * Learn how to define and call methods in Java.
 * Methods allow you to organize code into reusable blocks, each performing a specific task.
 */
public class _7_MethodExercises {

    // TODO: 1 - Create a method called greet that takes a String parameter 'name'
    // and prints "Hello, {name}!"
    // Hint: public static void greet(String name) { ... }
    public static void greet(String name) {
        IO.println("Hello, " + name + "!");
        return;
    }

    // TODO: 2 - Create a method called add that takes two int parameters (a, b)
    // and returns their sum
    // Hint: public static int add(int a, int b) { ... }
    public static int add(int a, int b) {
        IO.println(a + b);
        return a + b;
    }

    // TODO: 3 - Create a method called isEven that takes an int parameter 'number'
    // and returns true if the number is even, false otherwise
    // Hint: Use the modulus operator (%)
    public static void isEven(int number) {
        if (number % 2 == 0) {
            IO.println("true");
        } else IO.println("false");
        return;
    }

    // TODO: 4 - Create a method called max that takes two int parameters (a, b)
    // and returns the larger of the two
    // Hint: Use an if statement or the ternary operator
    public static void max(int a, int b) {
        if (a > b) {
            IO.println(a + " is greater than " + b);
        } else if (a < b) {
            IO.println(a + " is less than " + b);
        } else IO.println(a + " and " + b + " are equal to each other");
        return;
    }

    // TODO: 5 - Create a method called factorial that takes an int parameter 'n'
    // and returns n! (n factorial) using a loop
    // Hint: 5! = 5 * 4 * 3 * 2 * 1 = 120. Use a long return type for larger values.
    public static void factorial(long n) {
        for (int i = 1; i <= 5 ; i++) {
            IO.println(n *= 5);
        }
        return;
    }

    // TODO: 6 - Create two overloaded methods called multiply:
    //   - One that takes 2 int parameters and returns their product
    //   - One that takes 3 int parameters and returns their product
    // Overloading means having multiple methods with the same name but different parameters.
    static int multiply(int a, int b) {
        IO.println(a * b);
        return a * b;
    }

    static int multiply(int c, int d, int e) {
        IO.println(c * d * e);
        return c * d * e;
    }

    public static void main(String[] args) {

        // TODO: 7 - Call all the methods above and print their results
        // - Call greet with your name
        greet("Ali");
        IO.println();
        // - Call add with two numbers and print the result
        add(33, 2);
        IO.println();
        // - Call isEven with a number and print whether it is even
        isEven(32);
        IO.println();
        // - Call max with two numbers and print the larger one
        max(40, 33);
        IO.println();
        // - Call factorial with 5 and print the result
        factorial(5);
        IO.println();
        // - Call both multiply methods and print their results
        multiply(5, 7);
        multiply(6, 8,12);
    }
}
