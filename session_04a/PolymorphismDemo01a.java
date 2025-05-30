// Parent Class
class Base{
    public void display() {
        System.out.println("Parent has built the building");
    }
}

//Child class
class derived extends Base{
   
    @Override
   public void display(){
    super.display();
    System.out.println("Child has been altered the building");

   } 
}

// Main class that runs/ or starting point
public class PolymorphismDemo01a{

    public static void main(String[] args){
       derived d=new derived();
       d.display();
    }
}
