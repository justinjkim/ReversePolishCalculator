package com.company;


import java.text.NumberFormat;
import java.text.ParseException;

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

        top = 0; // counter

        // 3. write the algorithm
        for(int i = 0; i < tokens.length; ++i) {
            // calls to push() and pop() and do the math here


            if (tokens[i].equals("+")) {
                // push(pop() + pop());
                stack[top - 1] + stack[top - 2];


            }
            else {
                push(tokens[i]); // ok, this should be easy, just add any non-operator into the stack
            }

        }

        // 4. return the result
        return pop();
    }

    private void push(String number) {
        // push on the stack

        stack[top] = number;
        top++;
    }

    private void push(double d) {
        // change the double to a string and then push it on the stack

        stack[top] = Double.toString(d);
        top++;
    }

    private double pop() {
        // remove the string from the top of the stack and convert it to a double and return it


        top--;
        return Double.parseDouble(stack[top]);
    }
}

