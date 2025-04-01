

// Main class where the program starts execution
public class ClassAndObject {
    
    // Main method - entry point for the program
    public static void main(String[] args) {
        // Calling the printmsg() method from the main class
        // This will display a message from the main method
        printmsg(); 
        
        // Creating an object of the ClassAndObject class using the default constructor
        SecondClass obj1 = new SecondClass();
        
        // Calling the printmsg() method from the ClassAndObject object
        obj1.printmsg(); 
    }

    // Method in the main class that prints a message
    public static void printmsg(){
        // Printing a message from the main class
        System.out.println("hello from main method");
        
        // Creating an object of the ClassAndObject class inside this method
        // This calls the default constructor of the ClassAndObject class
        SecondClass obj1 = new SecondClass();
        
        // Calling the printmsg() method of the ClassAndObject class
        obj1.printmsg();
    }
}




// Class with constructor overloading
// This class contains a method to print messages
class SecondClass {

    // Method that prints a message when called
    public void printmsg(){
        // Printing a message from the ClassAndObject class
        System.out.println("hello from additional class method");
    }
}
