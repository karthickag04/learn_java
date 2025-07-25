
import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args){
        // // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text

        System.out.println("Hello, " + name + "!");
        // // Close the scanner to free up resources

        System.out.print("Enter value1 : ");
        int value1 = scanner.nextInt(); // Read an integer
        System.out.print("Enter value2 : ");
        int value2 = scanner.nextInt(); // Read another integer
        int sum = value1 + value2; // Calculate the sum
        System.out.println("The sum of " + value1 + " and " + value2 + " is: " + sum);
        // System.out.println("You are " + age + " years old.");
        scanner.close();

        // JavaMethodDemo03 jmd3=new JavaMethodDemo03();
        // jmd3.addition(10, 20);}
    
}
}
