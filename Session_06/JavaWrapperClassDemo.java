
public class JavaWrapperClassDemo {
    
    public static void main(String[] args) {
        // // Primitive data types
        // int num = 10;
        // double decimal = 20.5;
        // char letter = 'A';
        // boolean flag = true;


        // // Wrapping primitive data types into wrapper classes
        // Integer wrappedNum = Integer.valueOf(num);
        // Double wrappedDecimal = Double.valueOf(decimal);
        // Character wrappedLetter = Character.valueOf(letter);
        // Boolean wrappedFlag = Boolean.valueOf(flag);

        // // Unwrapping wrapper classes back to primitive data types
        // int unwrappedNum = wrappedNum.intValue();
        // double unwrappedDecimal = wrappedDecimal.doubleValue();
        // char unwrappedLetter = wrappedLetter.charValue();
        // boolean unwrappedFlag = wrappedFlag.booleanValue();

        // // Displaying the results
        // System.out.println("Wrapped Integer: " + wrappedNum);
        // System.out.println("Unwrapped Integer: " + unwrappedNum);
        
        // System.out.println("Wrapped Double: " + wrappedDecimal);
        // System.out.println("Unwrapped Double: " + unwrappedDecimal);
        
        // System.out.println("Wrapped Character: " + wrappedLetter);
        // System.out.println("Unwrapped Character: " + unwrappedLetter);
        
        // System.out.println("Wrapped Boolean: " + wrappedFlag);
        // System.out.println("Unwrapped Boolean: " + unwrappedFlag);




        // using wrapper classes for conversion
        String strNum = "123";
        String strNum01 = "123";
        

        int result = Integer.parseInt(strNum) + Integer.parseInt(strNum01);

        // int a = 10;
        // int b = 20;
        // int result = a + b;

        System.out.println("String :: " + result);
    }
}
