public class MethodOverloading01 {

    public static void main(String[] args) {
      additiondemo(2, 2);
      additiondemo(2.0, 2.5);
      additiondemo("Hello", "World");
      additiondemo("Hello", "World", "!");
    }


    public static void additiondemo(int  value1, int value2) {
        System.out.println("Addition of two integers passed through direct int storage logic: " + (value1 + value2));
    }

   

    public static void additiondemo(double  value1, double value2) {
        System.out.println("Addition of two integers passed through direct double storage logic: " + (value1 + value2));
    }

    public static void additiondemo(String  value1, String value2) {
        System.out.println("Addition of two integers passed through direct String storage logic: " + (value1 + value2));
    }
    public static void additiondemo(String  value1, String value2, String value3) {
        System.out.println("Addition of two integers passed through direct String storage logic: " + (value1 + value2 + value3));
    }


}



class MethodOverloading02 {

    public static void main(String[] args) {
        System.out.println(additiondemo(2, 2));
        System.out.println(additiondemo(2.0, 2.5));
        System.out.println(additiondemo("Hello", "World"));
        System.out.println(additiondemo("Hello", "World", "!"));
    }

    public static int additiondemo(int value1, int value2) {
        return value1 + value2;
    }

    public static double additiondemo(double value1, double value2) {
        return value1 + value2;
    }

    public static String additiondemo(String value1, String value2) {
        return value1 + value2;
    }

    public static String additiondemo(String value1, String value2, String value3) {
        return value1 + value2 + value3;
    }
}
