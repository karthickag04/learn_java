
public class ExceptionHandling {
    

public static void main(String[] args) {
    // Example 1: Handling ArithmeticException with try-catch-finally
    
    // int x = 10;
    // int y = 0;
    // int result = x / y;
    // System.out.println("Before try-catch block " + result);
    
    try {
        int a1 = 10;
        int b1 = 0;
        int result = a1 / b1;
        System.out.println("Result: " + result);
    }
     catch (Exception e) {
        // System.out.println( e.getMessage());

        String message = e.getMessage();

        if (message.contains("/ by zero")) {

            // implement scanner logic for getting user input

        System.out.println("Cannot divide by zero");
        } 
        else {
            System.out.println("Caught exception: " + message);
        }
    }
    finally {
        System.out.println("Finally block executed");
    }

    // try {
    //     int a = 10;
    //     String b = "10";
    //     int result = a / Integer.parseInt(b);
    //     System.out.println("Result: " + result);

    // } catch (Exception e) {
    //     System.out.println("Caught exception: " + e.getMessage());
    // }
    
    //  finally {
    //     System.out.println("Finally block executed");
    // }

    
   
}
}