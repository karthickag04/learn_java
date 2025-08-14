/**
 * Advanced Wrapper Classes Features
 * Parsing, Constants, and Utility Methods
 */
public class WrapperClassesAdvanced {
    public static void main(String[] args) {
        System.out.println("=== Advanced Wrapper Classes Features ===");
        
        // 1. Parsing Strings to Numbers
        System.out.println("\n1. Parsing Strings to Numbers:");
        
        try {
            String intStr = "123";
            String doubleStr = "45.67";
            String boolStr = "true";
            
            int parsedInt = Integer.parseInt(intStr);
            double parsedDouble = Double.parseDouble(doubleStr);
            boolean parsedBool = Boolean.parseBoolean(boolStr);
            
            System.out.println("Parsed int: " + parsedInt);
            System.out.println("Parsed double: " + parsedDouble);
            System.out.println("Parsed boolean: " + parsedBool);
            
            // Parsing with different radix (base)
            String binaryStr = "1010";
            String hexStr = "FF";
            
            int fromBinary = Integer.parseInt(binaryStr, 2);  // Base 2
            int fromHex = Integer.parseInt(hexStr, 16);  // Base 16
            
            System.out.println("Binary '1010' to decimal: " + fromBinary);
            System.out.println("Hex 'FF' to decimal: " + fromHex);
            
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
        
        // 2. Constants in Wrapper Classes
        System.out.println("\n2. Useful Constants:");
        
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Double MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Float POSITIVE_INFINITY: " + Float.POSITIVE_INFINITY);
        System.out.println("Float NEGATIVE_INFINITY: " + Float.NEGATIVE_INFINITY);
        System.out.println("Double NaN: " + Double.NaN);
        
        // 3. Utility Methods
        System.out.println("\n3. Utility Methods:");
        
        // Integer methods
        System.out.println("Integer.compare(10, 20): " + Integer.compare(10, 20));
        System.out.println("Integer.max(15, 25): " + Integer.max(15, 25));
        System.out.println("Integer.min(15, 25): " + Integer.min(15, 25));
        System.out.println("Integer.sum(10, 20): " + Integer.sum(10, 20));
        
        // Character methods
        char ch = 'A';
        System.out.println("Character.isDigit('5'): " + Character.isDigit('5'));
        System.out.println("Character.isLetter('A'): " + Character.isLetter('A'));
        System.out.println("Character.isUpperCase('A'): " + Character.isUpperCase('A'));
        System.out.println("Character.toLowerCase('A'): " + Character.toLowerCase('A'));
        System.out.println("Character.toUpperCase('a'): " + Character.toUpperCase('a'));
        
        // Double methods
        double d1 = 10.5;
        double d2 = Double.NaN;
        System.out.println("Double.isFinite(10.5): " + Double.isFinite(d1));
        System.out.println("Double.isNaN(NaN): " + Double.isNaN(d2));
        System.out.println("Double.isInfinite(1.0/0): " + Double.isInfinite(1.0/0));
        
        // 4. Converting Numbers to Different Formats
        System.out.println("\n4. Number Format Conversions:");
        
        int number = 255;
        System.out.println("Decimal " + number + " to binary: " + Integer.toBinaryString(number));
        System.out.println("Decimal " + number + " to octal: " + Integer.toOctalString(number));
        System.out.println("Decimal " + number + " to hex: " + Integer.toHexString(number));
        
        // 5. Handling Invalid Conversions
        System.out.println("\n5. Safe Parsing with Error Handling:");
        
        String[] testStrings = {"123", "abc", "45.67", "", "true"};
        
        for (String testStr : testStrings) {
            System.out.println("\nTesting string: '" + testStr + "'");
            
            // Safe integer parsing
            try {
                int result = Integer.parseInt(testStr);
                System.out.println("  As integer: " + result);
            } catch (NumberFormatException e) {
                System.out.println("  Cannot parse as integer");
            }
            
            // Safe double parsing
            try {
                double result = Double.parseDouble(testStr);
                System.out.println("  As double: " + result);
            } catch (NumberFormatException e) {
                System.out.println("  Cannot parse as double");
            }
            
            // Boolean parsing (never throws exception)
            boolean result = Boolean.parseBoolean(testStr);
            System.out.println("  As boolean: " + result);
        }
        
        // 6. Practical Example: Input Validation
        System.out.println("\n6. Practical Example - Input Validation:");
        
        String userAge = "25";
        String userScore = "89.5";
        
        if (isValidInteger(userAge)) {
            int age = Integer.parseInt(userAge);
            System.out.println("Valid age: " + age);
        }
        
        if (isValidDouble(userScore)) {
            double score = Double.parseDouble(userScore);
            System.out.println("Valid score: " + score);
        }
    }
    
    // Helper method to validate integer input
    public static boolean isValidInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    // Helper method to validate double input
    public static boolean isValidDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
