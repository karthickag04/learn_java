public class ExceptionHandling01 {
    public static void main(String[] args) {
      
        System.out.println("After exception handling");
        System.out.println("**********************************");
        divideWithExceptionHandling();
        System.out.println("**********************************");
        divideNormally();
        System.out.println("After normal division");
        System.out.println("**********************************");
       
        
    }

    public static void divideNormally() {
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void divideWithExceptionHandling() {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch(Exception e){
            // System.out.println("Caught exception: " + e.getMessage());
            String message = e.getMessage().toString();

            
            if (message.contains("/ by zero")) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println("Caught exception: " + message);
            }


        }
        finally {
            System.out.println("Finally block executed");
        }
       
        
    }
    
}
