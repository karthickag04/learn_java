// session on 14/03/2025
// This is the class definition for JavaMethodDemo
// The class contains a main method which is the entry point for the program
public class JavaMethodDemo {

    // Default constructor (empty) for the JavaMethodDemo class
    // Constructors are called when objects of the class are created, but this constructor does nothing
  
 
    // The main method is the entry point of the program
    public static void main(String[] var0) {
       // Prints the message "Hello World" to the console
       System.out.println("Hello World");
       
       // Calls the returnName method with the argument "John David1" and stores the result in var1
       String var1 = returnName("John David1");
       
       // Checks if var1 is equal to the string "John David" using reference comparison (==)
       if (var1 == "John David") {
          // If var1 is equal to "John David", it enters this block
          
          // Calls the returnName method with the argument "John Doe" and stores the result in var2
          String var2 = returnName("John Doe");
          
          // Checks if var2 is equal to the string "John Doe" using reference comparison (==)
          if (var2 == "John Doe") {
             // If var2 is equal to "John Doe", it enters this block and prints the message
             System.out.println("The name is John Doe");
          } else {
             // If var2 is not equal to "John Doe", it enters this block and prints the message
             System.out.println("The name is not John Doe");
          }
       } else {
          // If var1 is not equal to "John David", it enters this block and prints the message
          System.out.println("The name is not John David");
       }
    }
 



    // This is a void method called printName, which doesn't return any value
    // It simply prints the string "John Doe" to the console when called
    public static void printName() {
       System.out.println("John Doe");
    }
 
    // This is a method that returns a String value
    // It takes a String argument (var0) and returns the same String as the result
    public static String returnName(String var0) {
       return var0; // Returns the input parameter var0
    }
 
    // This is a method that returns an int value
    // It doesn't take any parameters and calculates the sum of two byte variables
    public static int returnSalary() {
       byte var0 = 23;  // Assigns 23 to var0 (byte type)
       byte var1 = 10;  // Assigns 10 to var1 (byte type)
       
       // Adds var0 and var1 together and stores the result in var2 (int type)
       int var2 = var0 + var1;
       
       // Returns the result (sum) as an int
       return var2;
    }
 }
 