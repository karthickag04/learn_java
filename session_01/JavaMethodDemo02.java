public class JavaMethodDemo02 {

    public static void main(String[] args) {
        System.out.println("Arthimatic Operations in Java");
        addition();
        System.out.println("****************");
        addition(20,20);
        System.out.println("****************");
        addition(20,20,20);

        System.out.println("****************");
        subtract();
        
        
    }

    public static void addition(){
        int value1 = 10;
        int value2 = 20;
        int result = value1 + value2;
        System.out.println("Added value of value1 and value2  .. " + result);
        System.out.println("Added value of value1 and value2  .. " + (value1 + value2));

    }
  

    public static void addition(int x, int y)
    {
        int result = x + y;
        System.out.println("Added value of value1 and value2  .. " + result);
        System.out.println("Added value of value1 and value2  .. " + (x + y));
    }

    public static void addition(int x, int y, int z)
    {

        int result = x + y + z;
        System.out.println("Added value of value1 and value2  .. " + result);
        System.out.println("Added value of value1 and value2  .. " + (x + y + z));
    }

    public static void subtract(){
        int value1 = 10;
        int value2 = 20;
        int result = value1 - value2;
        System.out.println("subtracted value of value1 and value2  .. " + result);
        System.out.println("subtracted value of value1 and value2  .. " + (value1 - value2));
 
    }

}
    

