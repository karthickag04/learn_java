public class RelationalOperatorsProgram {
    public static void main(String[] args) {
        int a = 25;
        int b = 20;
        boolean resultless =a <b;

        // Relational Operators
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a > b: " + (25 > 20));     // greater than
        System.out.println("a < b: " + (a < b));     // less than
        System.out.println("a >= b: " + (a >= b));   // greater than or equal to
        System.out.println("a <= b: " + (a <= b));   // less than or equal to
        System.out.println("a == b: " + (a == b));   // equal to
        System.out.println("a != b: " + (a != b));   // not equal to

        // Extra example: comparing characters
        char x = 'A';
        char y = 'B';
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x < y: " + (x < y));     // comparing ASCII values
    }
}
