package com.company;


public class ReversePolishCalc {

    // You'll need a variable here to keep track of the top of the stack
    private int top; // will be the first element of the array?

    // The array of the input string split up
    private String[] tokens;

    // The stack
    private String[] stack;

    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");

        // 2. Allocate a stack as big as the number of tokens
        stack = new String[tokens.length]; // ohhhh....this is a String stack because we're keeping strings in the array, not integers

        // 3. write the algorithm
        for(int i = 0; i < tokens.length; ++i) {
            // calls to push() and pop() and do the math here
        }

        // 4. return the result
        return pop();
    }

    private void push(String number) {
        // push on the stack
    }

    private void push(double d) {
        // change the double to a string and then push it on the stack
    }

    private double pop() {
        // remove the string from the top of the stack and convert it to a double and return it
    }
}

