
// {} - Curly Braces
// [] - Square brackets
// () - Paranthesis

// // - this used for comments in java


/* this is also syntax for commenting 
 * 
 * this is for multiple line
 * you can write detailed work flow of the program using this comment
 * 
 */



public class JavaSyntax01 {
    
    public static void main(String[] args) {

       
        //     System.out.println("Hello, World!");
        //     printMsg1();
        //     printMsg2();
        //     printMsg3();
        //     printMsg4();

        // JavaSyntax js = new JavaSyntax();
        // js.printMsg5("John");

        // Sample.printMsg50(); // static method from another class
        // Sample sampleObj = new Sample();
        // sampleObj.printMsg60(); // non static method from another class

        OperatorArithmeticClass.addOp(5, 10); // integer addition
        OperatorArithmeticClass.addOp(5.5, 10.2); // double addition
        OperatorArithmeticClass.subOp(10, 5); // integer subtraction
        OperatorArithmeticClass.subOp(10.5, 5.2); // double subtraction
        OperatorArithmeticClass.mulOp(2, 3); // integer multiplication
        OperatorArithmeticClass.mulOp(2.5, 3.5); // double multiplication
        OperatorArithmeticClass.divOp(10, 2); // integer division
        OperatorArithmeticClass.divOp(10.0, 2.0); // double division
        OperatorArithmeticClass.modOp(10, 3); // integer modulo
    }
     public static void printMsg1(){
    System.out.println("Hello, World! from printMsg1");
    }
     public static void printMsg2(){
    System.out.println("Hello, World! from printMsg2");
    }
     public static void printMsg3(){
    System.out.println("Hello, World! from printMsg3");
    }
     public static void printMsg4(){
    System.out.println("Hello, World! from printMsg4");
    }

     public void printMsg5(String name){
    System.out.println("Hello, World! from printMsg5 and non static method......." + "Hi " +name);
    }
    


}




class Sample{

  public static void printMsg50(){
    System.out.println("Hello, World! from printMsg50 and static method from another class");
    }
  public  void printMsg60(){
    System.out.println("Hello, World! from printMsg60 and non static method from another class");
    }
    // this is another class in the same file
}





class OperatorArithmeticClass {

    public static void addOp(int a, int b) {
        System.out.println(a + b);
    }
    public static void addOp(double a, double b) {
        System.out.println(a + b);
    }

    public static void subOp(int a, int b) {
        System.out.println(a - b);
    }
    public static void subOp(double a, double b) {
        System.out.println(a - b);
    }

    public static void mulOp(int a, int b) {
        System.out.println(a * b);
    }
    public static void mulOp(double a, double b) {
        System.out.println(a * b);
    }

    public static void divOp(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        System.out.println(a / b);
    }
    public static void divOp(double a, double b) {
        if (b == 0.0) throw new ArithmeticException("Division by zero");
        System.out.println(a / b);
    }

    public static void modOp(int a, int b) {
        if (b == 0) throw new ArithmeticException("Modulo by zero");
        System.out.println(a % b);
    }

    //
}