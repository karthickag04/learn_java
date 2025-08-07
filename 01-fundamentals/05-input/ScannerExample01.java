import  java.util.Scanner;

public class ScannerExample01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        System.out.println("Hello, " + name + "!");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        scanner.close();
    }

    public static void printMessage() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner1.nextLine();
        System.out.println("You entered: " + message);
        scanner1.close();
    }
}