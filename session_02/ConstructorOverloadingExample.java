public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        // Create objects using different constructors
        CalculatorWithConstructors calc1 = new CalculatorWithConstructors(10, 20);
        calc1.displayValues();
        
        CalculatorWithConstructors calc2 = new CalculatorWithConstructors(5, 15, 25);
        calc2.displayValues();
        
        CalculatorWithConstructors calc3 = new CalculatorWithConstructors();
        calc3.displayValues();
    }
}

class CalculatorWithConstructors {
    int a, b, c;

    // Constructor overloading examples
    public CalculatorWithConstructors(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = 0;
    }

    public CalculatorWithConstructors(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public CalculatorWithConstructors() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public void displayValues() {
        System.out.println("Values: a = " + a + ", b = " + b + ", c = " + c);
    }
}