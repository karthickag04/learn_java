class PolyCalculatorParent {
    public void calculate(int a, int b) {
        System.out.println("Parent class: " + (a + b));
    }

    public void calculate(int a, int b, int c) {
        System.out.println("Parent class: " + (a + b));
    }

    public void calculate(int a, int b, int c, int d) {
        System.out.println("Parent class: " + (a + b));
    }
}

class PolyAddition extends PolyCalculatorParent {

    @Override
    public void calculate(int a, int b) {
        System.out.println("Child class Addition: " + (a + b));
    }

    @Override
    public void calculate(int a, int b, int c) {
        System.out.println("Child class Addition: " + (a + b + c));
    }

    @Override
    public void calculate(int a, int b, int c, int d) {
        System.out.println("Child class Addition: " + (a + b + c + d));
    }
}

class PolySubtraction extends PolyCalculatorParent {

    @Override
    public void calculate(int a, int b) {
        System.out.println("Child class Subtraction: " + (a - b));
    }

    @Override
    public void calculate(int a, int b, int c) {
        System.out.println("Child class Subtraction: " + (a - b - c));
    }

    @Override
    public void calculate(int a, int b, int c, int d) {
        System.out.println("Child class Subtraction: " + (a - b - c - d));
    }
}

class PolyMultiply extends PolyCalculatorParent {

    @Override
    public void calculate(int a, int b) {
        System.out.println("Child class Multiply: " + (a * b));
    }

    @Override
    public void calculate(int a, int b, int c) {
        System.out.println("Child class Multiply: " + (a * b * c));
    }

    @Override
    public void calculate(int a, int b, int c, int d) {
        System.out.println("Child class Multiply: " + (a * b * c * d));
    }
}

class PolyDivision extends PolyCalculatorParent {

    @Override
    public void calculate(int a, int b) {
        if (b != 0) {
            System.out.println("Child class Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    @Override
    public void calculate(int a, int b, int c) {
        if (b != 0 && c != 0) {
            System.out.println("Child class Division: " + (a / b / c));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    @Override
    public void calculate(int a, int b, int c, int d) {
        if (b != 0 && c != 0 && d != 0) {
            System.out.println("Child class Division: " + (a / b / c / d));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {

        PolyAddition add = new PolyAddition();
        add.calculate(2, 3);
        add.calculate(2, 3, 4);
        add.calculate(2, 3, 4, 5);

        PolySubtraction sub = new PolySubtraction();
        sub.calculate(2, 3);
        sub.calculate(2, 3, 4);
        sub.calculate(2, 3, 4, 5);

        PolyMultiply multiply = new PolyMultiply();
        multiply.calculate(2, 3);
        multiply.calculate(2, 3, 4);
        multiply.calculate(2, 3, 4, 5);

        PolyDivision divide = new PolyDivision();
        divide.calculate(2, 3);
        divide.calculate(2, 3, 4);
        divide.calculate(2, 3, 4, 5);
    }
}
