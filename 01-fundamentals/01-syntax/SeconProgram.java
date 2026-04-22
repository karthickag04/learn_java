
public class SeconProgram {

    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");

        addition();
        subtraction();
        ThirdProgram.multiplication();
        ThirdProgram tp = new ThirdProgram();
        ThirdProgram tpp = new ThirdProgram();
        ThirdProgram tppq = new ThirdProgram();

        tp.division();
        tpp.division();
        tppq.division();
        SeconProgram sp = new SeconProgram();
        sp.modulus01();

    }

    public static void addition() {
        int x = 10;
        int y = 20;
        int sum = x + y;
        System.out.println("The sum of x and y is: " + sum);
    }

    public static void subtraction() {
        int x = 10;
        int y = 20;
        int difference = x - y;
        System.out.println("The difference of x and y is: " + difference);
    }

    public void modulus01() {
        int a = 10;
        int b = 3;
        int remainder = a % b;
        System.out.println("The remainder of a divided by b is: " + remainder);
    }

}

class ThirdProgram {

    public static void multiplication() {
        int a = 5;
        int b = 4;
        int product = a * b;
        System.out.println("The product of a and b is: " + product);
    }

    public void division() {
        int a = 20;
        int b = 5;
        int quotient = a / b;
        System.out.println("The quotient of a and b is: " + quotient);
    }
}
