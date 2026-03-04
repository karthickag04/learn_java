public class InheritanceDemo02 {
    public static void main(String[] args) {
        // Creating an object of Student class and using inherited methods

        // person std = new person();
        // std.printMessage(); // This will call the method from the Student class
        // System.out.println(std.location); // This will access the public variable from the Student class
        // System.out.println(std.occupation); // This will access the public variable from the Student class

        student1 std = new student1();
        std.printMessage(); // This will call the method from the Student class
        System.out.println(std.location); // This will access the public variable from the Student class
        System.out.println(std.occupation); // This will access the public variable from the Student class
    
        student2 std2 = new student2();
        std2.printMessage(); // This will call the method from the Student class
        System.out.println(std2.location); // This will access the public variable from the Student class
        System.out.println(std2.occupation); // This will access the public variable from the Student class
    
    }
    
}


class Gtec{
    public String location = "New York"; // Public variable
    public String occupation = "Student"; // Public variable

    public void printMessage(){
        System.out.println("Hello, I am a student.");
    }
}


class student1 extends Gtec
{

}

class student2 extends Gtec
{

}
class student3 extends Gtec
{

}

class  visitor extends student1
{

}