// File: VoidMethodsExample.java
// A class to demonstrate void methods and methods with return types, with individual input for each method
public class ClassAndObjectsExample2 {
    public static void main(String[] args) {
        // Demonstrate void methods
        printMessage();
        printMessage1();
        printMessage2();
        printMessage3();
        
        // Creating an object of CalculatorApp for void methods
        CalculatorApp obj1 = new CalculatorApp();
        obj1.add(10, 20, 30);
        obj1.subtract(10, 20, 30);
        obj1.multiply(10, 20, 30);
        obj1.divide(10, 20);
        
        // Creating an object of CalculatorAppWithReturnType for methods with return type
        CalculatorAppWithReturnType obj2 = new CalculatorAppWithReturnType();
        System.out.println("Sum: " + obj2.add(10, 20, 30));
        System.out.println("Difference: " + obj2.subtract(10, 20, 30));
        System.out.println("Product: " + obj2.multiply(10, 20, 30));
        System.out.println("Quotient (a/b): " + obj2.divide(10, 20));
    }

    // Various void methods
    public static void printMessage() {
        System.out.println("Hello from void method printMessage()!");
    }

    public static void printMessage1() {
        System.out.println("Hello from void method printMessage1()!");
    }

    public static void printMessage2() {
        System.out.println("Hello from void method printMessage2()!");
    }

    public static void printMessage3() {
        System.out.println("Hello from void method printMessage3()!");
    }
}

// Class with void methods for calculations, accepting parameters for each method
class CalculatorApp {

    // Void methods for calculations with parameters
    public void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public void subtract(int a, int b, int c) {
        System.out.println("Difference: " + (a - b - c));
    }

    public void multiply(int a, int b, int c) {
        System.out.println("Product: " + (a * b * c));
    }

    public void divide(int a, int b) {
        // To avoid division by zero error, checking if b is not zero
        if (b != 0) {
            System.out.println("Quotient (a/b): " + (a / (double) b));
        } else {
            System.out.println("Division by zero error!");
        }
    }
}

// Class with methods that return values, accepting parameters for each method
class CalculatorAppWithReturnType {

    // Methods with return type for calculations with parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double divide(int a, int b) {
        // To avoid division by zero error, checking if b is not zero
        if (b != 0) {
            return a / (double) b;
        } else {
            System.out.println("Division by zero error!");
            return Double.NaN; // Return NaN for division by zero
        }
    }
}
