package session_01;
/*

Session 1: Void Methods in Java
Objective: Learn about void methods, which don't return a value.

Explanation:
A void method is one that does not return a value. When you declare a method with the void keyword, you tell the Java compiler that this method won't return anything. These types of methods typically perform actions such as printing data, modifying objects, or performing calculations without needing a return value.


Syntax:


public static void methodName(parameters) {
    // method body
}


Example Code:
This example demonstrates a void method (printMessage) that prints a message to the console.


*/


public class SessionOnVoidMethod {

    public static void main(String[] args) {
        // Calling the void method
        printMessage();  // Outputs: "Hello from a void method!"
        printMessage1();  // Outputs: "Hello from a void method printMessage1()!"
        printMessage2();  // Outputs: "Hello from a void method printMessage2()!"
        printMessage3();  // Outputs: "Hello from a void method  printMessage3()!"
    }

    // Void method that prints a message
    public static void printMessage() {
        System.out.println("Hello from a void method named printMessage()!");
    }

    // Void method that prints a message
    public static void printMessage1() {
        System.out.println("Hello from a void method printMessage1()!");
    }
    // Void method that prints a message
    public static void printMessage2() {
        System.out.println("Hello from a void method printMessage2()!");
    }
    // Void method that prints a message
    public static void printMessage3() {
        System.out.println("Hello from a void method printMessage3()!");
    }

    
}
