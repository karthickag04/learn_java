import java.util.Arrays;

public class JavaDataTypes {
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

        // indianFoodArray: Array of strings describing Indian food
        String[] indianFoodArray = {
            "Biryani is a flavorful rice dish made with spices, meat, and vegetables.",
            "Butter Chicken is a creamy tomato-based curry with tender chicken pieces.",
            "Masala Dosa is a crispy rice pancake filled with spiced potato mixture.",
            "Paneer Tikka is a grilled dish made with marinated paneer cubes.",
            "Chole Bhature is a combination of spicy chickpea curry and fried bread.",
            "Rogan Josh is a rich and aromatic lamb curry from Kashmir.",
            "Samosa is a deep-fried pastry filled with spiced potatoes and peas.",
            "Pani Puri is a popular street food with crispy shells filled with tangy water.",
            "Dal Makhani is a creamy lentil curry made with black lentils and butter.",
            "Aloo Paratha is a stuffed flatbread filled with spiced mashed potatoes.",
            "Tandoori Chicken is a roasted chicken dish marinated in yogurt and spices.",
            "Idli is a steamed rice cake served with sambar and coconut chutney.",
            "Vada Pav is a spicy potato fritter sandwich from Mumbai.",
            "Gulab Jamun is a sweet dessert made with milk solids and soaked in syrup.",
            "Rasam is a tangy and spicy soup made with tamarind and spices.",
            "Pav Bhaji is a spicy mashed vegetable curry served with buttered bread.",
            "Kheer is a rice pudding made with milk, sugar, and cardamom.",
            "Dhokla is a steamed savory cake made with fermented rice and chickpea flour.",
            "Fish Curry is a tangy and spicy curry made with fresh fish and coconut milk.",
            "Lassi is a refreshing yogurt-based drink, sweet or salted."
        };

        
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
        
        
        // System.out.println("Array: " + Arrays.toString(j));


       

        System.out.println("Short Array: " + Arrays.toString(shortArray));
        System.out.println("Int Array: " + Arrays.toString(intArray));
        System.out.println("Long Array: " + Arrays.toString(longArray));
        System.out.println("Float Array: " + Arrays.toString(floatArray));
        System.out.println("Double Array: " + Arrays.toString(doubleArray));
        System.out.println("Char Array: " + Arrays.toString(charArray));
        System.out.println("Boolean Array: " + Arrays.toString(booleanArray));
        System.out.println("String Array: " + Arrays.toString(stringArray));

        // System.out.println("String Array for indianFoodArray: " + Arrays.toString(indianFoodArray));



        String[] stringUserArray = {"Karthickag04", "Raguvaran01", "Ravi02", "Ramu0007", "Kavin02", "Karthickag02", "Raguvaran012", "Ravi022", "Ramu00027", "Kavin022"};

        System.out.println("User Array list: " + Arrays.toString(stringUserArray));
// 
        System.out.println(stringUserArray.length);
        System.out.println(stringUserArray[0]);
        System.out.println(stringUserArray[1]);
        System.out.println(stringUserArray[2]);
        // System.out.println(stringUserArray[3]);
        // System.out.println(stringUserArray[4]);
        // System.out.println(stringUserArray[5]);
        // System.out.println(stringUserArray[6]);
        // System.out.println(stringUserArray[7]);
        // System.out.println(stringUserArray[8]);
        // System.out.println(stringUserArray[9]);
        // System.out.println("*****************************");
        // System.out.println("*****************************");
        // System.out.println("*****************************");
        // System.out.println("*****************************");
        
        // // Printing individual elements of byteArray using indices
        // for (int startpoint = 0; startpoint < stringUserArray.length; startpoint++) {
        //     System.out.println(stringUserArray[startpoint]);
        // }

        // System.out.println("*****************************");
        // System.out.println("*****************************");
        // System.out.println("*****************************");
        // System.out.println("*****************************");
        
        // Printing individual elements of stringUserArray using indices
        for (int startpoint = 0; startpoint < stringUserArray.length; startpoint++) {
            if ("Karthickag04".equals(stringUserArray[startpoint])) { // Corrected case sensitivity
                System.out.println("Hi " + stringUserArray[startpoint] + " !");
                System.out.println("Welcome to the Java world!");
                break; // Exit the loop after finding the first match
            }
        }
        


    }
}
