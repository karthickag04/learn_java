import java.util.*;

public class InputScanEx01 {

    public static void main(String[] args) {

        // Original integer input logic
        int value01, value02;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value 1 and 2 .... ");
        value01 = scanner.nextInt();
        value02 = scanner.nextInt();
        System.out.println("Added value of 01 and 02 ..... " + (value01 + value02));
        System.out.println("Added value of 01 and 02 ..... " + (value01 + value02));

        // Call static methods (you can uncomment to test each one)
        // floatAdditionWithPattern();
        // simpleAdditionExample1();
        // simpleAdditionExample2();
        // simpleAdditionExample3();

        AnotherClass ac = new AnotherClass();
        ac.Msg();

        AnotherClass1 ac1 = new AnotherClass1();
        ac1.Msg();

        scanner.close();
    }

    // Converted from commented float addition logic with pattern
    public static void floatAdditionWithPattern() {
        float value01, value02, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Value01 ....... ");
        value01 = input.nextFloat();

        System.out.println("Enter Value02 ....... ");
        value02 = input.nextFloat();

        System.out.println("Wait for your output");
        result = value01 + value02;

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        System.out.println("Added value of 01 and 02 ..... " + result);
    }

    // Simple hardcoded integer addition
    public static void simpleAdditionExample1() {
        int value01 = 10;
        int value02 = 30;
        int result = value01 + value02;
        System.out.println("Added value of 01 and 02 ..... " + result);
    }

    // Another style of simple integer addition
    public static void simpleAdditionExample2() {
        int value01, value02, result;
        value01 = 10;
        value02 = 30;
        result = value01 + value02;
        System.out.println("Added value of 01 and 02 ..... " + result);
    }

    // Another variation
    public static void simpleAdditionExample3() {
        int value01 = 10;
        int value02 = 20;
        int result = value01 + value02;
        System.out.println("Added value of 01 and 02 ..... " + result);
    }
}


class AnotherClass1 {
    public void Msg() {
        System.out.println("Welcome to Java from inside class");
    }
}
