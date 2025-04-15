public class JavaMethodDemo01{

    public static void main(String[] args){

        System.out.println("Arthimatic Operations");
        additon();
        System.out.println("***********************");
        System.out.println("***********************");
        
        additon(20, 30);

        System.out.println("***********************");
        System.out.println("***********************");
        additon(20, 30, 20);

    
        System.out.println("***********************");
        System.out.println("***********************");
        subtract();
    

    }

    public static void additon(){

        
        int value1 = 10;
        int value2 = 20;
        int result = value1 + value2;

        System.out.println("the added value of value1 and value2  .. " + result ); 
        System.out.println("the added value of value1 and value2  .. " + (value1 + value2) ); 
    }
  


    public static void additon(int value01 , int value02){

        int result = value01 + value02;
        
        System.out.println("Added value of 1 and 2 .. " + ( value01 + value02));
        System.out.println("Added value of 1 and 2 .. " + result);

    }

    public static void additon(int value01 , int value02, int value03){

        int result = value01 + value02 +value03;
        
        System.out.println("Added value of 1 and 2 .. " + ( value01 + value02 + value03));
        System.out.println("Added value of 1 and 2 .. " + result);

    }



    public static void subtract(){
        int x = 1;
        int y =2;
        System.out.println("subtracted value of x and y" + (x - y));
    }


}



