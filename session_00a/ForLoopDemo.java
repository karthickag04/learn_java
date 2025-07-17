/**
 * ForLoopDemo.java
 * 
 * This program demonstrates the use of FOR LOOPS in Java.
 * A for loop is a control flow statement that allows code to be executed repeatedly
 * based on a boolean condition. It's particularly useful when you know the exact
 * number of iterations needed.
 * 
 * Key concepts demonstrated:
 * - Array declaration and initialization
 * - For loop structure and syntax
 * - String array manipulation
 * - Conditional statements within loops
 * - String methods (contains, toUpperCase, replace)
 */

public class ForLoopDemo {

    /**
     * The main method serves as the entry point for the Java application.
     * It demonstrates a for loop that iterates through an array of names
     * and performs string operations on specific elements.
     * 
     * FOR LOOP SYNTAX:
     * for (initialization; termination_condition; increment/decrement) {
     *     // Code block to be executed
     * }
     * 
     * Components explained:
     * - Initialization: int i = 0 (executed once at the start)
     * - Termination condition: i < names.length (checked before each iteration)
     * - Increment: i++ (executed after each iteration)
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

        // FOR LOOP DEMONSTRATION
        // This loop iterates through each element in the names array
        for (int i = 0; i < names.length; i++) {
            
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
        }
        
        System.out.println("\n--- For loop demonstration completed ---");
    }
}
