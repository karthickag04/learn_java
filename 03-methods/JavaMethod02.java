public class JavaMethod02 {

   

    // Void methods for arithmetic operations
    public static void addVoid(int a, int b) {
        System.out.println("Addition (void): " + (a + b));
    }

    public static void subtractVoid(int a, int b) {
        System.out.println("Subtraction (void): " + (a - b));
    }

    public static void multiplyVoid(int a, int b) {
        System.out.println("Multiplication (void): " + (a * b));
    }

    public static void divideVoid(int a, int b) {
        if (b != 0) {
            System.out.println("Division (void): " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void modulusVoid(int a, int b) {
        if (b != 0) {
            System.out.println("Modulus (void): " + (a % b));
        } else {
            System.out.println("Modulus by zero is not allowed.");
        }
    }

    // Return type methods for arithmetic operations
    public static int addReturn(int a, int b) {
        return a + b;
    }

    public static int subtractReturn(int a, int b) {
        return a - b;
    }

    public static int multiplyReturn(int a, int b) {
        return a * b;
    }

    public static int divideReturn(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public static int modulusReturn(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }
    }

    // This is a simple Java program that prints "Hello, World!" to the console.
    // The main method is the entry point of the program.
    public static void main(String[] args) {

       

        int num1 = 20;
        int num2 = 10;

        // Calling void methods
        addVoid(num1, num2);
        subtractVoid(num1, num2);
        multiplyVoid(num1, num2);
        divideVoid(num1, num2);
        modulusVoid(num1, num2);

        System.out.println("*********************");

        // Calling return type methods
        System.out.println("Addition (return): " + addReturn(num1, num2));
        System.out.println("Subtraction (return): " + subtractReturn(num1, num2));
        System.out.println("Multiplication (return): " + multiplyReturn(num1, num2));
        try {
            System.out.println("Division (return): " + divideReturn(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Modulus (return): " + modulusReturn(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}