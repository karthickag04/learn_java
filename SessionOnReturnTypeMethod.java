/*
Session 2: Return-Type Methods in Java
Objective: Learn how to define methods that return values.

Explanation:
Return-type methods are methods that return a specific type of value. Unlike void methods, these methods must have a return type (such as int, String, double, etc.), and you must include a return statement to send back the result.



Syntax:

public static returnType methodName(parameters) {
    // method body
    return returnValue;
}

*/




// Example Code:
// This example demonstrates a return-type method (addNumbers) that returns the sum of two integers.

public class SessionOnReturnTypeMethod {

    public static void main(String[] args) {
        // Calling the return-type method and storing the result
        int sum = addNumbers(5, 3);
        System.out.println("The sum is: " + sum);  // Outputs: "The sum is: 8"
    }

    // Return-type method that returns an int
    public static int addNumbers(int value1, int value2) {
        return value1 + value2;
    }
}

