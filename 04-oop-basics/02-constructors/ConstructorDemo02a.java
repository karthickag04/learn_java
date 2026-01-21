public class ConstructorDemo02a {




    public static void main(String[] args) {

      ConstructorDemo02 cd02=new ConstructorDemo02();  
      ConstructorDemo02 cd02a=new ConstructorDemo02("ragu");  
      ConstructorDemo02 cd02b=new ConstructorDemo02("ragu",22);  

    }
    
}


class ConstructorDemo02{
    
    public  ConstructorDemo02(){
        System.out.println("this is default constructor");

    }
    public  ConstructorDemo02(String name){
        System.out.println("Hi .., " + name + " you have entered into parameterized constructor");

    }
    public  ConstructorDemo02(String name, int age){
        System.out.println("Hi .., " + name + " you have entered into parameterized constructor on you age of " + age);

    }
}