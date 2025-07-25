/**
 * DoWhileLoopDemo.java
 * 
 * This program demonstrates the use of DO-WHILE LOOPS in Java.
 * A do-while loop is similar to a while loop, but with one key difference:
 * the code block is executed at least once before the condition is checked.
 * This makes it useful when you need to ensure the loop body runs at least one time.
 * 
 * Key concepts demonstrated:
 * - Array declaration and initialization
 * - Do-while loop structure and syntax
 * - Post-condition loop evaluation
 * - Manual loop counter management
 * - Conditional statements within loops
 * - String methods (contains, toUpperCase, replace)
 */

public class DoWhileLoopDemo {

    /**
     * The main method serves as the entry point for the Java application.
     * It demonstrates a do-while loop that iterates through an array of names
     * and performs string operations on specific elements.
     * 
     * DO-WHILE LOOP SYNTAX:
     * initialization;
     * do {
     *     // Code block to be executed
     *     increment/decrement;
     * } while (condition);
     * 
     * Components explained:
     * - Initialization: int i = 0 (done before the loop)
     * - Code execution: Happens first, before condition check
     * - Condition: i < names.length (checked AFTER each iteration)
     * - Increment: i++ (manually managed inside the loop body)
     * 
     * Key difference from while loop:
     * - while loop: Check condition FIRST, then execute
     * - do-while loop: Execute FIRST, then check condition
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

        // DO-WHILE LOOP DEMONSTRATION
        // Initialize the loop control variable BEFORE the do-while loop
        int i = 0;
        
        // Do-while loop: Execute the code block first, then check the condition
        do {
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
            // This must be done before the condition check
            i++;
            
        } while (i < names.length); // Condition is checked AFTER each iteration
        
        System.out.println("\n--- Do-while loop demonstration completed ---");
        
        // Additional demonstration: Empty array scenario
        // This shows the key difference between while and do-while loops
        System.out.println("\n--- Demonstrating do-while with empty array ---");
        String[] emptyArray = {};
        int j = 0;
        
        // This do-while will execute once even though the array is empty
        do {
            System.out.println("This message appears even with empty array!");
            j++;
        } while (j < emptyArray.length);
        
        System.out.println("Do-while executed " + j + " time(s) with empty array.");
    }
}
