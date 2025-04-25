
import java.util.Scanner;

public class InputViaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Reading a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Example 2: Reading an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        // Example 3: Reading a double
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        // Example 4: Reading a boolean
        System.out.print("Do you like programming? (true/false): ");
        boolean likesProgramming = scanner.nextBoolean();
        System.out.println("Likes programming: " + likesProgramming);

        // Example 5: Reading multiple inputs
        System.out.print("Enter your city and country (separated by a space): ");
        scanner.nextLine(); // Consume the leftover newline
        String city = scanner.next();
        String country = scanner.next();
        // String address = scanner.next();
        System.out.println("You live in " + city + ", " + country + ".");

        scanner.close();
    }
}






/**
 * This class demonstrates various ways of taking user input using the Scanner class.
 *
 * <p>The Scanner class is a simple text scanner which can parse primitive types and strings 
 * using regular expressions. It has several useful methods for reading input from various sources,
 * such as:
 * <ul>
 *   <li>{@link java.util.Scanner#nextLine()} - Reads an entire line of input (including spaces).
 *   <li>{@link java.util.Scanner#nextInt()} - Reads the next token as an integer.
 *   <li>{@link java.util.Scanner#nextDouble()} - Reads the next token as a double.
 *   <li>{@link java.util.Scanner#nextBoolean()} - Reads the next token as a boolean.
 *   <li>{@link java.util.Scanner#next()} - Reads the next token (word) from the input.
 *   <li>{@link java.util.Scanner#close()} - Closes the scanner and releases any associated resources.
 * </ul>
 *
 * <p>Examples include:
 * <ul>
 *   <li>Reading a user's name with {@link java.util.Scanner#nextLine()}.
 *   <li>Reading an integer (user's age) through {@link java.util.Scanner#nextInt()}.
 *   <li>Reading a double (user's height) via {@link java.util.Scanner#nextDouble()}.
 *   <li>Reading a boolean (user's programming interest) using {@link java.util.Scanner#nextBoolean()}.
 *   <li>Handling multiple inputs (city and country) with a combination of {@link java.util.Scanner#nextLine()} 
 *       and {@link java.util.Scanner#next()}.
 * </ul>
 *
 * <p>Note: After reading numeric or boolean values, the Scanner might leave a newline character 
 * in the buffer, which is why it is sometimes necessary to call {@link java.util.Scanner#nextLine()} 
 * to consume this leftover newline before reading further input.
 */
