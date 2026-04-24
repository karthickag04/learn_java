
public class SeconProgramReturn {

    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");

        // addition();
        // subtraction();
        // ThirdProgram.multiplication();
        // ThirdProgram tp = new ThirdProgram();
        // ThirdProgram tpp = new ThirdProgram();
        // ThirdProgram tppq = new ThirdProgram();

        // tp.division();
        // tpp.division();
        // tppq.division();
        SeconProgramReturn sp = new SeconProgramReturn();
        // sp.modulus01();
        int result = addition();
        System.out.println("Addition: " + result);
        System.out.println("division from SeconProgramReturn: " + sp.division());

        ThirdProgram tp = new ThirdProgram();
        System.out.println("division from ThirdProgram: " + tp.division());


    }

    public static int addition() {
        int x = 10;
        int y = 20;
        int sum = x + y;
        // System.out.println("The sum of x and y is: " + sum);
        return sum;

    }

    public static int subtractionOperaton() {
        int x = 10;
        int y = 20;
        int difference = x - y;
        // System.out.println("The difference of x and y is: " + difference);
        return difference;
    }

    public int modulus01() {
        int a = 10;
        int b = 3;
        int remainder = a % b;
        // System.out.println("The remainder of a divided by b is: " + remainder);
        return remainder;
    }

    public int division() {
        int a = 21;
        int b = 5;
        int quotient = a / b;
        // System.out.println("The quotient of a and b is: " + quotient);
        return quotient;
    }

}

class ThirdProgram {

    public static int multiplication() {
        int a = 5;
        int b = 4;
        int product = a * b;
        // System.out.println("The product of a and b is: " + product);
        return product;
    }

    public double  division() {
        double a = 21d;
        double b = 5d;
        double quotient = a / b;
        // System.out.println("The quotient of a and b is: " + quotient);
        return quotient;
    }
}
