import java.util.Scanner;

public class JavaMethodDemo04{

    public static void main(String[] args){
        // System.out.println("Hello ! ..." + args[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello ! ..." + name);

   


        DemoClass demo = new DemoClass();
        demo.nextPrint();
        demo.nextPrintln();
        
    

        JavaMethodDemo04 demo04 = new JavaMethodDemo04();
        demo04.nextPrintmsg();


        nextPrintmsg01();


        addition();
        addition(10,20);
        addition(10,20);
        addition(10,20, 30);
        addition(10,20, 30,60);
    }

    public void nextPrintmsg(){
        System.out.println("Hello ! ... Welcome to Java Programming");
    }
    
    
    public static void nextPrintmsg01(){
        System.out.println("Hi ! ... Welcome to Java Programming");
    }

    public static void addition(){
        int value1 = 10;
        int value2 = 20;
        int result = value1 + value2;

        System.out.println("the added value of value1 and value2  .. " + result ); 
       
    }

    public static void addition(int a1, int b){
        int result = a1 + b;
        System.out.println("the added value of value1 and value2  .. " + result ); 
    }
    public static void addition(int a1, int b, int c){
        int result = a1 + b + c;
        System.out.println("the added value of value1 and value2 and value3  .. " + result ); 
    }
    public static void addition(int a1, int b, int c, int d){
        int result = a1 + b + c + d;
        System.out.println("the added value of value1 and value2 and value3 and value4  .. " + result ); 
    }

}
