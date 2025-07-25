public class ReturnTypeMethods {

    public static void printMessage() {
        System.out.println("This is a method.");
    }

    public static void printMessage01() {
        System.out.println("This is a method.");
    }

    public static void printMessage02() {
        printMessage();
        printMessage01();
    }

    public static long Cal4Number() {
        // System.out.println("This is a method.");
        return 9876543210l;
    }

    public static void Cal4Number01() {
        System.out.println("9876543210");
        // return 9876543210l;
    }

    public static int returnInt() {
        return 42;
    }

    public static double returnDouble() {
        return 3.14159;
    }

    public static float returnFloat() {
        return 2.718f;
    }

    public static char returnChar() {
        return 'A';
    }

    public static boolean returnBoolean() {
        return true;
    }

    public static short returnShort() {
        return 12345;
    }

    public static byte returnByte() {
        return 127;
    }

    // This is a simple Java program that prints "Hello, World!" to the console.
    // The main method is the entry point of the program.
    public static void main(String[] args) {

        if (Cal4Number() == 9876543210l) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        System.out.println("*********************");
        System.out.println(Cal4Number());

        // Calling and checking int return type
        if (returnInt() > 40) {
            System.out.println("Integer is greater than 40");
        } else {
            System.out.println("Integer is less than or equal to 40");
        }

        // Calling and checking double return type
        if (returnDouble() > 3.0) {
            System.out.println("Double is greater than 3.0");
        } else {
            System.out.println("Double is less than or equal to 3.0");
        }

        // Calling and checking float return type
        if (returnFloat() == 2.718f) {
            System.out.println("Float matches 2.718");
        } else {
            System.out.println("Float does not match 2.718");
        }

        // Calling and checking char return type
        if (returnChar() == 'A') {
            System.out.println("Character is 'A'");
        } else {
            System.out.println("Character is not 'A'");
        }

        // Calling and checking boolean return type
        if (returnBoolean()) {
            System.out.println("Boolean is true");
        } else {
            System.out.println("Boolean is false");
        }

        // Calling and checking short return type
        if (returnShort() > 10000) {
            System.out.println("Short is greater than 10000");
        } else {
            System.out.println("Short is less than or equal to 10000");
        }

        // Calling and checking byte return type
        if (returnByte() == 127) {
            System.out.println("Byte is 127");
        } else {
            System.out.println("Byte is not 127");
        }
    }
}