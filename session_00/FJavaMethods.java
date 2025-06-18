public class FJavaMethods {
    public static void main(String[] args) {
       
        System.out.println("Hello, World!");
        add();
        addition(3, 4);
        System.out.println("Sum with return: " + addwithreturn());
    }


    public static void addition(int a, int b) {
        System.out.println("Sum: " + (a + b));

    }


    public static void add() {
        int a = 5;
        int b = 10;
        System.out.println("Sum: " + (a + b));
    }


    public static float addwithreturn() {
        float a = 5;
        float b = 10;
        return a + b;
    }
}   