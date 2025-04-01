public class MethodDemo {
    public static void main(String[] args) {
        // Prints the message "Hello World" to the console
        // System.out.println("Hello World"); 
        int result= add(5, 10);
        System.out.println(result); 

        

        if(result ==15){
            int finalresult=result+20;
            if(finalresult == 35){
                System.out.println("The result is correct");
            }
            else{
                System.out.println("The result is not correct");
            }
        }
        else{
            System.out.println("The result is not correct");
        }
        

    }

    public static int add(int a, int b) {
        return a + b; // Returns the sum of a and b
    }

    public static void add1(int a, int b) {
        System.out.println(a + b) ; // Returns the sum of a and b
    }
}