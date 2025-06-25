public class ClassAndObject02{

    public static void main(String[] args){
        System.out.println("Hello, World!");

        if( 20 == addition()){
            System.out.println("The addition method returned 20.");
        } else {
            System.out.println("The addition method did not return 20.");
        }
        subtraction();
        NewClass.Addition();
        NewClass newClassInstance = new NewClass();
        newClassInstance.subtraction();
        
    }


    public static int addition(){
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        return sum;
    }

    public static void subtraction(){
        int a = 10;
        int b = 5;
        int difference = a - b;
        System.out.println("The difference between " + a + " and " + b + " is: " + difference);
    }



}

class NewClass{
    public static void Addition(){
        int a = 151;
        int b = 201;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public void subtraction(){
        int a = 201;
        int b = 151;
        int difference = a - b;
        System.out.println("The difference between " + a + " and " + b + " is: " + difference);
    }
}