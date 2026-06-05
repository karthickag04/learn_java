import java.util.Scanner;

public class ScannerExample01a {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("lets do arithmatic operations");
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        int difference = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " is: " + difference);
        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        


    }

}