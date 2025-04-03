public class Java_data_types {
    public static void main(String[] args) {
        // Primitive Data Types
        byte e = 100; // 8-bit signed integer
        short f = 10000; // 16-bit signed integer
        int a = 10; // 32-bit signed integer
        long g = 10000000000L; // 64-bit signed integer
        float b = 20.5f; // 32-bit floating point
        double h = 20.5d; // 64-bit floating point
        char c = 'A'; // single character
        boolean d = true; // true or false value

        // byte e = 128; // 8-bit signed integer, can store -128 to 127
        // short f = 32768; // 16-bit signed integer, can store -32768 to 32767
        // int a = 2147483648; // 32-bit signed integer, can store -2147483648 to 2147483647
        // long g = 9223372036854775808L; // 64-bit signed integer, can store -9223372036854775808 to 9223372036854775807
        // float b = 3.4e38f; // 32-bit floating point, can store up to 
        // double h = 1.8e308d; // 64-bit floating point, can store up to 1.8e308
        // char c = 'A'; // single character, can store any Unicode character
        // boolean d = true; // true or false value

        String ii ="Hello World !";

        String i = """
            Hello, World! fslfksdlfksd
            fsdfds
        """;
        
        int[] j = {1, 2, 3, 4, 5}; // array of integers

        byte[] byteArray = {1, 2, 3, 4, 5};
        short[] shortArray = {1, 2, 3, 4, 5};
        int[] intArray = {1, 2, 3, 4, 5};
        long[] longArray = {1L, 2L, 3L, 4L, 5L};
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        double[] doubleArray = {1.1d, 2.2d, 3.3d, 4.4d, 5.5d};
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        boolean[] booleanArray = {true, false, true, false, true};
        String[] stringArray = {"Hello", "World", "Java", "Programming", "Language"};

        // Printing the values
        System.out.println("Byte: " + e);
        System.out.println("Short: " + f);
        System.out.println("Int: " + a);
        System.out.println("Long: " + g);
        System.out.println("Float: " + b);
        System.out.println("Double: " + h);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + d);
        System.out.println("String: " + ii);
        System.out.println("String: " + i);
        System.out.println("Array: " + java.util.Arrays.toString(j));


       System.out.println("Byte Array: " + java.util.Arrays.toString(byteArray));
        System.out.println("Short Array: " + java.util.Arrays.toString(shortArray));
        System.out.println("Int Array: " + java.util.Arrays.toString(intArray));
        System.out.println("Long Array: " + java.util.Arrays.toString(longArray));
        System.out.println("Float Array: " + java.util.Arrays.toString(floatArray));
        System.out.println("Double Array: " + java.util.Arrays.toString(doubleArray));
        System.out.println("Char Array: " + java.util.Arrays.toString(charArray));
        System.out.println("Boolean Array: " + java.util.Arrays.toString(booleanArray));
        System.out.println("String Array: " + java.util.Arrays.toString(stringArray));


    }
}
