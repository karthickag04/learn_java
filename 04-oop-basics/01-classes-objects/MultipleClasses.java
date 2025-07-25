public class MultipleClasses{

    public static void main(String[] args) {
      System.out.println("Hello World!"); 
      msg();
      msg1();

      ClassAndObject02 cao02=new ClassAndObject02();
      System.out.println("Hello World! from class02 which has third class object");
      cao02.msg1();
      

      ClassAndObject03 cao03=new ClassAndObject03();
      System.out.println("*******************************");
      
        cao03.printmsg();
        cao03.printmsg();
        cao03.printmsg();

     
    }

    public static  void msg(){
        System.out.println("Hello World! from method msg()"); 

    }


    public static  void msg1(){

        System.out.println("Hello World! from method msg1()"); 

    }


}


 class ClassAndObject02
{

    public   void msg(){
        System.out.println("Hello World! from class02's method msg ()"); 
    }
    public   void msg1(){
        System.out.println("Hello World! from class02's method msg1()"); 
        ClassAndObject03 cao03_1=new ClassAndObject03();
        cao03_1.printmsg();
    }  
   

}

 class ClassAndObject03
{

    public   void printmsg(){
        System.out.println("Welcome Msg from class03"); 
    }
    
   

}



