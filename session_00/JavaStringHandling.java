public class JavaStringHandling {

    public static void main(String[] args) {
        // Call the static methods to demonstrate their functionality
        String input = "Hello, World!";
        
        System.out.println("Original String: " + input);
        // System.out.println("Reversed String: " + reverseString(input));
        System.out.println("Uppercase String: " + toUpperCase(input));
        System.out.println("Lowercase String: " + toLowerCase(input));
        System.out.println("String Length: " + getStringLength(input));
        System.out.println("Character at Index 1: " + getCharAt(input, 1));
        System.out.println("Substring (0, 5): " + getSubstring(input, 0, 5));
        System.out.println("String Contains 'World': " + containsSubstring(input, "World"));
        System.out.println("String Starts With 'Hello': " + startsWith(input, "Hello"));
        System.out.println("String Ends With '!': " + endsWith(input, "!"));
        System.out.println("String Replaced 'World' with 'Java': " + replaceSubstring(input, "World", "Java"));
        System.out.println("String Without Whitespace: " + removeWhitespace(input));
        System.out.println("String Concatenated with ' Enjoy!': " + concatenateStrings(input, " Enjoy!"));
        System.out.println("Is String Empty: " + isEmpty(input));
    }

    // Method to reverse a string
    // public static String reverseString(String str) {
    //     return new StringBuilder(str).reverse().toString();
    // }

    // Method to convert a string to uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // Method to convert a string to lowercase
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    // Method to get the length of a string
    public static int getStringLength(String str) {
        return str.length();
    }

    // Method to get a character at a specific index
    public static char getCharAt(String str, int index) {
        return str.charAt(index);
    }

    // Method to get a substring
    public static String getSubstring(String str, int start, int end) {
        return str.substring(start, end);
    }

    // Method to check if a string contains a specific substring
    public static boolean containsSubstring(String str, String substring) {
        return str.contains(substring);
    }

    // Method to check if a string starts with a specific prefix
    public static boolean startsWith(String str, String prefix) {
        return str.startsWith(prefix);
    }

    // Method to check if a string ends with a specific suffix
    public static boolean endsWith(String str, String suffix) {
        return str.endsWith(suffix);
    }

    // Method to replace a substring with another substring
    public static String replaceSubstring(String str, String target, String replacement) {
        return str.replace(target, replacement);
    }

    // Method to remove all whitespace from a string
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    // Method to concatenate two strings
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    // Method to check if a string is empty
    public static boolean isEmpty(String str) {
        return str.isEmpty();
    }
}


