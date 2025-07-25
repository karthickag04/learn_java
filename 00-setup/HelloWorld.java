public class HelloWorld {
    /**
     * The main method - entry point of every Java program
     * @param args Command line arguments (we'll learn about these later)
     */
    public static void main(String[] args) {
        // Print a simple message
        System.out.println("Hello, World!");
        
        // Print multiple messages
        System.out.println("Welcome to Java Programming!");
        System.out.println("This is your first Java program.");
        
        // You can also use print() instead of println()
        System.out.print("This prints without a new line. ");
        System.out.println("This continues on the same line.");
        
        // Basic arithmetic
        System.out.println("5 + 3 = " + (5 + 3));
        System.out.println("10 - 4 = " + (10 - 4));
        System.out.println("6 * 7 = " + (6 * 7));
        System.out.println("15 / 3 = " + (15 / 3));
        
        // Print some patterns
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*****");
    }
}
