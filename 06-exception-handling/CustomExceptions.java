
public class CustomExceptions {

    public static void main(String[] args) {
        // ArithmeticException: This exception arises when an exceptional arithmetic condition has occurred, such as division by zero.
        // Reasons: It occurs when an operation is attempted that is mathematically invalid, like dividing by zero.
        arithmeticException();

        // ArrayIndexOutOfBoundsException: This exception is thrown to indicate that an array has been accessed with an illegal index.
        // Reasons: It occurs when an application tries to access an array element with an index that is outside the bounds of the array.
        arrayIndexOutOfBoundsException();

        // NullPointerException: This exception is thrown when an application attempts to use an object reference that has the null value.
        // Reasons: It occurs when an application tries to use an object reference that has not been initialized or has been set to null.
        nullPointerException();

        // NumberFormatException: This exception is thrown to indicate that the application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
        // Reasons: It occurs when an application tries to convert a string to a numeric type, but the string does not have the correct format.
        numberFormatException();

        // ClassCastException: This exception is thrown to indicate that the code has attempted to cast an object to a type with which it is not compatible.
        // Reasons: It occurs when an application tries to cast an object to a type that is not compatible with the object's actual type.
        classCastException();

        // InputMismatchException: This exception is thrown by a Scanner to indicate that the token retrieved does not match the pattern for the expected type, or that the token is out of range for the expected type.
        // Reasons: It occurs when an application tries to read input data that does not match the expected type or is out of range.
        inputMismatchException();

        // FileNotFoundException: This exception is thrown by the classes FileInputStream, FileOutputStream, and RandomAccessFile to indicate that the file specified in their constructors does not exist.
        // Reasons: It occurs when an application tries to open a file that does not exist.
        fileNotFoundException();

        // IllegalArgumentException: This exception is thrown to indicate that a method has been passed an illegal or inappropriate argument.
        // Reasons: It occurs when an application passes an argument to a method that is not valid or is not in the correct range.
        illegalArgumentException();

        // StringIndexOutOfBoundsException: This exception is thrown by String methods to indicate that an index is either negative or greater than or equal to the size of the string.
        // Reasons: It occurs when an application tries to access a character in a string with an index that is out of range.
        stringIndexOutOfBoundsException();

        // UnsupportedOperationException: This exception is thrown to indicate that the requested operation is not supported.
        // Reasons: It occurs when an application tries to perform an operation that is not supported by the object or class.
        unsupportedOperationException();
    }

    public static void arithmeticException() {
        try {
            int a = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("ArithmeticException handled\n");
        }
    }

    public static void arrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // Accessing index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("ArrayIndexOutOfBoundsException handled\n");
        }
    }

    public static void nullPointerException() {
        try {
            String str = null;
            System.out.println(str.length()); // Calling method on null reference
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("NullPointerException handled\n");
        }
    }

    public static void numberFormatException() {
        try {
            int i = Integer.parseInt("ABC123"); // Parsing non-numeric string
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } finally {
            System.out.println("NumberFormatException handled\n");
        }
    }

    public static void classCastException() {
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Invalid casting
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        } finally {
            System.out.println("ClassCastException handled\n");
        }
    }

    public static void inputMismatchException() {
        try {
            // Simulating scanner input with wrong type
            java.util.Scanner scanner = new java.util.Scanner("hello");
            int num = scanner.nextInt(); // Expecting int but got string
        } catch (java.util.InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        } finally {
            System.out.println("InputMismatchException handled\n");
        }
    }

    public static void fileNotFoundException() {
        
        try {
            // Trying to open a non-existent file
            java.io.FileReader file = new java.io.FileReader("nonexistent.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        } finally {
            System.out.println("FileNotFoundException handled\n");
        }
    }

    public static void illegalArgumentException() {
        try {
            // Passing invalid argument to method
            Thread.sleep(-100); // Negative sleep time
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception: " + e.getMessage());
        } finally {
            System.out.println("IllegalArgumentException handled\n");
        }
    }

    public static void stringIndexOutOfBoundsException() {
        try {
            String str = "hello";
            System.out.println(str.charAt(10)); // Accessing invalid string index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("StringIndexOutOfBoundsException handled\n");
        }
    }

    public static void unsupportedOperationException() {
        try {
            // Trying to modify an unmodifiable list
            java.util.List<String> list = java.util.Collections.unmodifiableList(
                    new java.util.ArrayList<>(java.util.Arrays.asList("a", "b")));
            list.add("c"); // Unsupported operation
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        } finally {
            System.out.println("UnsupportedOperationException handled\n");
        }
    }
}


// Java Exception Hierarchy:
// 1. Throwable (Superclass of all exceptions and errors)
// 2. Error (Subclass of Throwable, represents programming errors)
// 3. Exception (Subclass of Throwable, represents application-level exceptions)
//    3.1. RuntimeException (Subclass of Exception, represents unchecked exceptions)
//    3.2. IOException (Subclass of Exception, represents checked exceptions)

// Unchecked Exceptions (Runtime Exceptions):
// 1. ArithmeticException
// 2. ArrayIndexOutOfBoundsException
// 3. ArrayStoreException
// 4. ClassCastException
// 5. ConcurrentModificationException
// 6. DateTimeException (Java 8+)
// 7. EmptyStackException
// 8. IllegalArgumentException
// 9. IllegalStateException
// 10. IndexOutOfBoundsException
// 11. MissingResourceException
// 12. NegativeArraySizeException
// 13. NoSuchElementException
// 14. NullPointerException
// 15. NumberFormatException
// 16. SecurityException
// 17. StringIndexOutOfBoundsException
// 18. UnsupportedOperationException

// Checked Exceptions (Compile-Time Exceptions):
// 1. ClassNotFoundException
// 2. CloneNotSupportedException
// 3. EOFException
// 4. FileAlreadyExistsException (Java 7+)
// 5. FileNotFoundException
// 6. IOException
// 7. InterruptedException
// 8. InterruptedIOException
// 9. MalformedURLException
// 10. NoSuchFieldException
// 11. NoSuchMethodException
// 12. ParseException
// 13. ProtocolException
// 14. SQLException
// 15. SocketException
// 16. TimeoutException
// 17. UnknownHostException
// 18. URISyntaxException
// 19. UTFDataFormatException

// Errors (Serious Issues, Usually Unrecoverable):
// 1. AbstractMethodError
// 2. AssertionError
// 3. ClassCircularityError
// 4. ClassFormatError
// 5. ExceptionInInitializerError
// 6. IllegalAccessError
// 7. IncompatibleClassChangeError
// 8. InstantiationError
// 9. InternalError
// 10. LinkageError
// 11. NoClassDefFoundError
// 12. NoSuchFieldError
// 13. NoSuchMethodError
// 14. OutOfMemoryError
// 15. StackOverflowError
// 16. ThreadDeath
// 17. UnsupportedClassVersionError
// 18. VerifyError
// 19. VirtualMachineError
