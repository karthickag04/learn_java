public class ConstructorDemo {
    public static void main(String[] args) {
        
        SecondClass obj1 = new SecondClass();
        obj1.printmsg();
        
        
        new SecondClass("Hello");
        new SecondClass("Hello", 10);
        new SecondClass( 10,"Hello");
        
    }
}


class SecondClass{

    public void printmsg(){
        System.out.println("hello from additional class method");
    }

    public SecondClass() {
        System.out.println("Constructor of SecondClass called");
    }

    public SecondClass(String x) {
        System.out.println(x + "  Constructor of SecondClass called");
    }

    public SecondClass(String x, int y) {
        System.out.println(x + "  Constructor of SecondClass called with two arguments");
    }
    public SecondClass( int y,String x) {
        System.out.println(x + "  Constructor of SecondClass called with two arguments and has integer first");
    }

    public SecondClass(String x, int y, String z) {
        System.out.println(x + "  Constructor of SecondClass called");
    }
    public SecondClass(String x, int y, String z, int a) {

        System.out.println(x + "  Constructor of SecondClass called");
    }
}
