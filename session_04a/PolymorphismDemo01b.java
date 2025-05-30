public class PolymorphismDemo01b {
    public static void main(String[] args) {
        System.out.println(additon(10.0, 10.0));
        System.out.println(additon(10, 10));
        System.out.println(additon(10.0f, 10.0f));
        System.out.println(additon("Hello", " World"));
        
    }

    
    public static int additon(int a , int b){
       
        return  a + b;
    }
    public static float additon(float  a , float b){
       
        return  a + b;
    }
    public static String additon(String  a , String b){
       
        return  a + b;
    }
    public static double additon(double  a , double b){
       
        return  a + b;
    }


}
