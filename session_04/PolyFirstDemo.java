public class PolyFirstDemo {
    public static void main(String[] args) {
        System.out.println("****** Compile-Time Polymorphism ******");

        // Calling overloaded methods
        addition();                          // No parameters
        addition(10, 20);                    // Two int parameters
        addition(10, 20, 30);                // Three int parameters
        System.out.println("add(int, int): " + add(10, 10));              // int version
        System.out.println("add(double, double): " + add(10.5, 20.3));    // double version
        System.out.println("add(int, int, float): " + add(10, 20, 30.5f));// int, int, float version
        System.out.println("add(float, float): " + add(10.2f, 5.3f));     // float version
        System.out.println("add(String, String): " + add("Karthick", " AG")); // String version
    }

    // Overloaded methods

    public static void addition() {
        int a = 10, b = 20;
        System.out.println("Addition of a and b is " + (a + b));
    }

    public static void addition(int a, int b) {
        System.out.println("Addition of two integers: " + (a + b));
    }

    public static void addition(int a, int b, int c) {
        System.out.println("Addition of three integers: " + (a + b + c));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static float add(int a, int b, float c) {
        return a + b + c;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }
}
