
public class JavaVariables {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // 1. Primitive Variables
        // byte: 8-bit signed (-128 to 127)
        byte byteVar = 10;
        // short: 16-bit signed (-32,768 to 32,767)
        short shortVar = 20;
        // int: 32-bit signed (-2,147,483,648 to 2,147,483,647)
        int intVar = 30;
        // long: 64-bit signed (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long longVar = 40L;
        // float: 32-bit IEEE 754 floating point
        float floatVar = 50.5f;
        // double: 64-bit IEEE 754 floating point
        double doubleVar = 60.6d;
        // char: 16-bit unsigned (0 to 65,535)
        char charVar = 'A';
        // boolean: 1-bit (true or false)
        boolean boolVar = true;

    

        // 2. Reference Variables
        // String: Reference type to sequence of characters (no fixed size, can be null)
        String stringVar1 = "Hello, World!";
        String stringVar = """
        Hello, World!
        This is a multi-line string.
        You can use it to write long text without worrying about line breaks.
        You can also use it to format text with indentation and line breaks.
        You can use it to write long text without worrying about line breaks.
                """;
        // Integer: Wrapper class for int (null-safe, range same as int: -2,147,483,648 to 2,147,483,647)
        Integer integerVar = 10;
        // Double: Wrapper class for double (null-safe, range same as double)
        Double doubleVarRef = 20.5d;






        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);
        System.out.println("stringVar: " + stringVar);
        System.out.println("integerVar: " + integerVar);
        System.out.println("doubleVarRef: " + doubleVarRef);
     
       
       
    }



    public static void PersonalDetails() {
        // Declare and initialize personal details variables
        String FirstName = "John Doe";
        String First_Name = "John Doe";
        String FirstName111 = "John Doe";


        int Age = 25;
        String address = "123 Main Street, Springfield";
        String dateOfBirth = "1998-05-15";
        String courseName = "Computer Science";
        String location = "New York";
        String phoneNumber = "123-456-7890";
        String alternateNumber = "987-654-3210";

        // Print personal details
        System.out.println("Personal Details:");
        System.out.println("Name: " + FirstName);
        System.out.println("Name: " + First_Name);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + address);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Course Name: " + courseName);
        System.out.println("Location: " + location);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Alternate Number: " + alternateNumber);
    }

}



// Java Variable Declaration Best Practices

// 1. Declare variables at the top of the method
// 2. Use meaningful variable names
// 3. Use camelCase for variable names


// Java Variable Declaration Do's and Don'ts
// DO:
// - Declare variables at the top of the method
// - Use meaningful variable names
// - Use camelCase for variable names
// - Use final keyword for variables that don't change
// - Use meaningful variable names for arrays, collections, maps, enums, lambda expressions, method references, local variables, method parameters, exception variables, resource variables, thread variables, and volatile variables

// DON'T:
// - Use single-letter variable names
// - Use variable names that are not descriptive
// - Use variable names that are not in camelCase
// - Use variables that are not declared at the top of the method
// - Use variables that are not final when they don't change


// Variable Naming Conventions in Java

// 1. kebab-case: 
// Not recommended in Java, but used in other languages (e.g., JavaScript, CSS)
// 2. Hungarian notation: Not recommended in Java, but used in other languages (e.g., C, C++)
// 3. PascalCase: Used in Java for class names, but not for variable names
// 4. snake_case: Not recommended in Java, but used in other languages (e.g., Python, Ruby)
// 5. camelCase: Recommended in Java for variable names

// Example:
// Good variable name: `firstName`
// Bad variable name: `first_name` (snake_case)
// Bad variable name: `FirstName` (PascalCase)
// Bad variable name: `FIRST_NAME` (all caps)
// Bad variable name: `fn` (single-letter variable name)