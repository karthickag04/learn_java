// Class definition - The main container for our program
public class FirstProgram{ // PascalCase

    // Main method - The entry point where the program starts execution
    public static void main(String [] args){

        // Variable declarations - Storing integer values in variables
        int firstPerson = 22;
        int secondPerson = 23;


        // method calling
        printMessage01();   
        printMessage02();
        printMessage03();
        
        // Object instantiation - Creating an instance (object) of FirstProgram
        FirstProgram fp=new FirstProgram();
        // Calling an instance method using the object reference
        fp.printMessage04();

        // Creating an instance of another class (SecondProgram)
        SecondProgram sp=new SecondProgram();
        // Calling an instance method of the SecondProgram class
        sp.printMessage04();

        
        // Calling a static method from the SecondProgram class using its class name
        SecondProgram.printMessage03();

        /*
        fsdafds
        fsdfsd
        fsdfsd
        fsdf
        dsfsd
        
        */

    }


    // method declaration
    // Static method declaration - Method belongs to the class itself
    public static void printMessage01(){ // camelCase
        System.out.println("Welcome to Java from method one");
    }
    public static void printMessage02(){ // camelCase
        System.out.println("Welcome to Java from method two");
    }
    
    public static void printMessage03(){ // camelCase
        System.out.println("Welcome to Java from method three");
    }

    // Instance method declaration - Method belongs to an object of the class
    public void printMessage04(){ // camelCase method without static
        System.out.println("Welcome to Java from method four but created without static");
    }


}


// Another class definition - Used to demonstrate multi-class functionality
class SecondProgram{

        public static void printMessage03(){ // camelCase
        System.out.println("Welcome to Java from method three which is created under second class");
    }

    public void printMessage04(){ // camelCase method without static
        System.out.println("Welcome to Java from method four which created without static under second class");
    }

}
