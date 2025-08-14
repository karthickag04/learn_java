/**
 * Wrapper Classes Example
 * Wrapper classes wrap primitive data types into objects
 * 
 * Primitive -> Wrapper Class
 * byte     -> Byte
 * short    -> Short
 * int      -> Integer
 * long     -> Long
 * float    -> Float
 * double   -> Double
 * char     -> Character
 * boolean  -> Boolean
 */
public class WrapperClassesBasic {
    public static void main(String[] args) {
        System.out.println("=== Basic Wrapper Classes ===");
        
        // 1. Creating wrapper objects
        System.out.println("\n1. Creating Wrapper Objects:");
        
        // Manual boxing (primitive to wrapper)
        Integer intObj = new Integer(42);  // Deprecated since Java 9
        Integer intObj2 = Integer.valueOf(42);  // Preferred way
        Double doubleObj = Double.valueOf(3.14);
        Boolean boolObj = Boolean.valueOf(true);
        Character charObj = Character.valueOf('A');
        
        System.out.println("Integer object: " + intObj2);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Boolean object: " + boolObj);
        System.out.println("Character object: " + charObj);
        
        // 2. Autoboxing (automatic primitive to wrapper conversion)
        System.out.println("\n2. Autoboxing (Automatic conversion):");
        
        Integer autoInt = 100;  // Automatically converts int to Integer
        Double autoDouble = 2.5;  // Automatically converts double to Double
        Boolean autoBool = false;  // Automatically converts boolean to Boolean
        
        System.out.println("Auto-boxed Integer: " + autoInt);
        System.out.println("Auto-boxed Double: " + autoDouble);
        System.out.println("Auto-boxed Boolean: " + autoBool);
        
        // 3. Unboxing (wrapper to primitive)
        System.out.println("\n3. Unboxing (Wrapper to primitive):");
        
        Integer wrapperInt = 200;
        int primitiveInt = wrapperInt.intValue();  // Manual unboxing
        int autoUnboxedInt = wrapperInt;  // Auto-unboxing
        
        System.out.println("Manual unboxing: " + primitiveInt);
        System.out.println("Auto unboxing: " + autoUnboxedInt);
        
        // 4. Null values (advantage of wrapper classes)
        System.out.println("\n4. Null Values (Wrapper advantage):");
        
        Integer nullableInt = null;  // Wrapper can be null
        // int primitiveInt2 = null;  // This would cause compilation error
        
        if (nullableInt == null) {
            System.out.println("Integer wrapper can be null");
        }
        
        // 5. Comparing wrapper objects
        System.out.println("\n5. Comparing Wrapper Objects:");
        
        Integer a = 100;
        Integer b = 100;
        Integer c = new Integer(100);
        Integer d = 200;
        Integer e = 200;
        
        System.out.println("a == b: " + (a == b));  // true (cached values -128 to 127)
        System.out.println("a == c: " + (a == c));  // false (different objects)
        System.out.println("a.equals(c): " + a.equals(c));  // true (same value)
        System.out.println("d == e: " + (d == e));  // false (not cached, different objects)
        System.out.println("d.equals(e): " + d.equals(e));  // true (same value)
        
        // 6. Converting between types
        System.out.println("\n6. Type Conversions:");
        
        String numberStr = "123";
        Integer fromString = Integer.parseInt(numberStr);
        System.out.println("String to Integer: " + fromString);
        
        Integer number = 456;
        String toString = number.toString();
        System.out.println("Integer to String: " + toString);
    }
}
