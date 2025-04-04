public class ConditionalProgram {
    public static void main(String[] args) {
        int number = 15;

        // if-else condition
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Nested if
        if (number % 2 == 0) {
            System.out.println("It is an even number.");
        } else {
            System.out.println("It is an odd number.");
        }

        // Ternary Operator
        String result = (number > 10) ? "Greater than 10" : "10 or less";
        System.out.println("Ternary check: " + result);
    }
}
