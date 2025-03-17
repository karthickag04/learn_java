public class MethodOverloadingExample {
    public static void main(String[] args) {
        CalculatorWithReturnType calc = new CalculatorWithReturnType();
        
        // Demonstrate overloaded methods
        int sum3 = calc.add(10, 20, 30);
        System.out.println("Sum of three: " + sum3);
        
        int sum4 = calc.add(10, 20, 30, 40);
        System.out.println("Sum of four: " + sum4);
        
        float sumFloat = calc.add(1.5f, 2.5f, 3.5f, 4.0f);
        System.out.println("Sum of floats: " + sumFloat);
    }
}

class CalculatorWithReturnType {
    // Method overloading examples
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public float add(float a, float b, float c, float d) {
        return a + b + c + d;
    }
}