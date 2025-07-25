/**
 * WhileLoopDemo.java
 * 
 * This program demonstrates the use of WHILE LOOPS in Java.
 * A while loop is a control flow statement that allows code to be executed repeatedly
 * based on a boolean condition. Unlike for loops, while loops are typically used
 * when the number of iterations is not known in advance.
 * 
 * Key concepts demonstrated:
 * - Array declaration and initialization
 * - While loop structure and syntax
 * - Manual loop counter management
 * - Conditional statements within loops
 * - String methods (contains, toUpperCase, replace)
 */

public class WhileLoopDemo {

    /**
     * The main method serves as the entry point for the Java application.
     * It demonstrates a while loop that iterates through an array of names
     * and performs string operations on specific elements.
     * 
     * WHILE LOOP SYNTAX:
     * initialization;
     * while (condition) {
     *     // Code block to be executed
     *     increment/decrement;
     * }
     * 
     * Components explained:
     * - Initialization: int i = 0 (done before the loop)
     * - Condition: i < names.length (checked before each iteration)
     * - Increment: i++ (manually managed inside the loop body)
     */
    public static void main(String[] args) {

        // Array Declaration and Initialization
        // Creating a String array with Tamil names for demonstration
        String[] names = {
            "Arun",      // Index 0
            "Karthik",   // Index 1
            "Priya",     // Index 2
            "Lakshmi",   // Index 3
            "Vijay",     // Index 4
            "Anitha",    // Index 5
            "Suresh",    // Index 6
            "Meena",     // Index 7
            "Ravi",      // Index 8 - Target element for processing
            "Divya"      // Index 9
        };

        // Display the entire array using Arrays.toString() method
        System.out.println("Complete list of names: " + java.util.Arrays.toString(names));

        // Display the length (number of elements) in the array
        System.out.println("Total number of names: " + names.length); 

        // WHILE LOOP DEMONSTRATION
        // Initialize the loop control variable BEFORE the while loop
        int i = 0;
        
        // While loop continues as long as the condition (i < names.length) is true
        while (i < names.length) {
            
            // Conditional check: Process only names containing "Ravi"
            if (names[i].contains("Ravi")) {
                System.out.println("\n--- Processing name containing 'Ravi' ---");
                
                // 1. Display the original name
                System.out.println("Original name: " + names[i]);
                
                // 2. Convert to uppercase and display
                System.out.println("Uppercase version: " + names[i].toUpperCase());
                
                // 3. Replace substring "vi" with "jesh" and display
                System.out.println("Modified name: " + names[i].replace("vi", "jesh"));
            }
            
            // IMPORTANT: Increment the loop variable manually
            // Forgetting this step would create an infinite loop!
            i++;
        }
        
        System.out.println("\n--- While loop demonstration completed ---");
    }
}
