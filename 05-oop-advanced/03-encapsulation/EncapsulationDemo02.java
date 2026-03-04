public class EncapsulationDemo02 {





    public static void main(String[] args) {
        // Creating an object of Person class and using encapsulated methods

        Student student = new Student();
        student.printMessage();
        System.out.println(student.location);
        System.out.println(student.occupation);
        System.out.println(student.getName()); // This will cause an error because name is private
        System.out.println(student.getAge()); // This will cause an error because age is private
        student.setName("Alice");
        student.setAge(22);
        System.out.println(student.getName()); // This will print "Alice"
        System.out.println(student.getAge()); // This will print 22



     }
    
}


class Student{

    private String name = "John"; // Private variable
    private int age = 20; // Private variable
    
    public String location = "New York"; // Public variable
    public String occupation = "Student"; // Public variable

    public void printMessage(){
        System.out.println("Hello, I am a student.");
    }

    public String getName(){
        return name; // Getter method for name
    }

    public int getAge(){
        return age; // Getter method for name
    }

    public void setName(String name){
        this.name = name; // Setter method for name
    }

    public void setAge(int age){
        this.age = age; // Setter method for age
    }

}