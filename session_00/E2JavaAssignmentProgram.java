public class E2JavaAssignmentProgram {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Assignment Operators
        a += b; // a = a + b
        System.out.println("Addition Assignment: " + a); // 30

        a -= b; // a = a - b
        System.out.println("Subtraction Assignment: " + a); // 10

        a *= b; // a = a * b
        System.out.println("Multiplication Assignment: " + a); // 200

        a /= b; // a = a / b
        System.out.println("Division Assignment: " + a); // 10

        a %= b; // a = a % b
        System.out.println("Modulus Assignment: " + a); // 10
    }
}
