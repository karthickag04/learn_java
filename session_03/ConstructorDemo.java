public class ConstructorDemo {
    public static void main(String[] args) {
        SecondClass obj1 = new SecondClass();
        obj1.printmsg();

        
        SecondClass obj2 = new SecondClass("Hello");
        
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
}
