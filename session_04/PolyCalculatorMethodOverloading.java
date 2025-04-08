public class PolyCalculatorMethodOverloading {

    
 public static int add(int a, int b) {
    return a + b;
}

public static int add(int a, int b, int c) {
    return a + b + c;
}

public static double add(double a, double b) {
    return a + b;
}

public static double add(double a, double b, double c) {
    return a + b + c;
}

public static String add(String a, String b) {
    return a + b;
}

public static String add(String a, String b, String c) {
    return a + b + c;
}



    public static void main(String[] args) {
        System.out.println(add(2, 3));       // Output: 5
        System.out.println(add(1, 2, 3));    // Output: 6
        System.out.println(add(2.5, 3.7));   // Output: 6.2
        System.out.println(add(1.2, 2.5, 3.7)); // Output: 7.4
        System.out.println(add("Hello", "World")); // Output: "HelloWorld"
        System.out.println(add("Hello", " ", "World")); // Output: "Hello World"
    }


}
