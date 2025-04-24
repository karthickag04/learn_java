public class JavaMethodDemo03{

    public static void main(String[] args) {

    int a=12;
    int b=13;

    addition(a, b);
    System.out.println("The sum of a = "+ a+ " and b= " +b+ " is from return type:   " + add(a, b));
 
    }

    public static void addition(int x, int y) {
        int sum=x+y;
        System.out.println("The sum of a = "+ x+ " and b= " +y+ " is from void method:   " + sum);
    }



    public static int add(int x, int y) {
       
        int sum=x+y;

        return sum;
       
        
    }


    
}

// Pascal case
