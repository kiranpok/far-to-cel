package org.example;

public class Calculator {

    public int calculate(Operation operation, int a, int b) {
        switch (operation) {
            case ADD:
                return a+b;
            case SUBTRACT:
                return a-b;
            case MULTIPLY:
                return a*b;
            case DIVIDE:
                if (b == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                return a/b;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }

    public enum Operation {
 ADD, SUBTRACT, MULTIPLY, UNKNOWN_OPERATION, DIVIDE
 }
 }
