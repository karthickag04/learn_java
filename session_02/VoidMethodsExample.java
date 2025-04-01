package session_03;
// A class to demonstrate void methods
public class VoidMethodsExample {
    public static void main(String[] args) {
        // Demonstrate void methods
        printMessage();
        printMessage1();
        printMessage2();
        printMessage3();
        
        CalculatorApp calculator = new CalculatorApp(10, 20, 30);
        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();
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

class CalculatorApp {
    int a, b, c;

    public CalculatorApp(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Void methods for calculations
    public void add() {
        System.out.println("Sum: " + (a + b + c));
    }

    public void subtract() {
        System.out.println("Difference: " + (a - b - c));
    }

    public void multiply() {
        System.out.println("Product: " + (a * b * c));
    }

    public void divide() {
        System.out.println("Quotient (a/b): " + (a / b));
    }
}