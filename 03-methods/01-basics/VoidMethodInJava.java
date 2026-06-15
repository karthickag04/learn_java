public class VoidMethodInJava{

  
    
    public static void main(String[] args){
    Instagram insta1 = new Instagram(); // calls default constructor
    // Instagram insta2 = new Instagram("Ragu"); // calls default constructor
    // Instagram insta2a = new Instagram("Rajesh"); // calls default constructor
    // Instagram insta3 = new Instagram("Ravi","Ravi@123"); // calls default constructor

    insta1.printHello();
    // insta2.printHello();
    // insta2a.printHello();

    // insta3.printHello();
    // System.out.println(insta3.name);
    // insta3.printName("ravinew");
    // System.out.println(insta3.name);
    // insta3.name="ravi_updated";
    // System.out.println(insta3.name);
    // // insta3.printNameStatic();
    // Instagram.printNameStatic();
    // VoidMethodInJava.Helpme();
    // 
    }

    // public static void Helpme(){}

   


}

class Instagram{

    public  String name = "";
    // public int age=0;


    public Instagram(){ // constructor - default constructor
        System.out.println("Welcome to Instagram!");
        this.name = "Guest";
    }

    // public Instagram(String username){ // constructor - parameterized constructor
    //     System.out.println("Welcome to Instagram, " + username + "!");
    //     this.name= username;
    // }
    
    // public Instagram(String myName, String password){ // constructor - parameterized constructor
    //     System.out.println("Welcome to Instagram, " + myName + "!.. "+ "Your password is: " + password);
    //     this.name = myName;
    // }
    

     public void printHello(){
        System.out.println("Hello, " + name);
    }
    //  public void printName(String name_new){
    //     System.out.println("Hello, " + name_new);
    //     this.name = name_new;
    // }
     
    //  public int printName(){
    //     // System.out.println("Hello, " + name_new);
    //     return this.age;
    // }

    //    public static void printNameStatic(){
    //     System.out.println("Hello, ");
    //     // return this.age;
    }
     



