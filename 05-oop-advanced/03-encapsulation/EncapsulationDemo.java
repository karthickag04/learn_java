
// import java.lang.classfile.Superclass;

// Encapsulation is a fundamental concept in object-oriented programming (OOP) that binds together the data and the methods that manipulate that data, 
// and keeps both safe from outside interference and misuse. In other words, it's a protective wrapper that prevents the data from being accessed by the code outside this wrapper.


// Access Specifiers in Java

// 1. Public: Accessible from anywhere in the program
// 2. Private: Accessible only within the same class
// 3. Protected: Accessible within the same class and subclasses
// 4. Default (no modifier): Accessible within the same class, subclasses, and classes in the same package



// The Person class demonstrates encapsulation by keeping the 'name' variable private
// and providing public getter and setter methods to access and modify it.
class Person {
    private String name; // Private variable

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String newName) {
        this.name = newName;
    }
}

// The EncapsulationDemo class extends Person and demonstrates usage of variables and methods.
public class EncapsulationDemo extends Person {
    int x = 10; // Instance variable
    int y = 20; // Instance variable
    int z = 30; // Instance variable

    public static void main(String[] args) {
        staticDisplay();

        EncapsulationDemo demo = new EncapsulationDemo();
        demo.display();
        int result = demo.x + demo.y + demo.z;
        System.out.println("Result: " + result);

        System.out.println("Instance variable x: " + demo.x);
        System.out.println("Instance variable y: " + demo.y);
        System.out.println("Instance variable z: " + demo.z);

        // Creating an object of Person class and using encapsulated methods
        Person person = new Person();
        person.setName("John Doe");
        System.out.println("Person's name: " + person.getName());
    }

    // Instance method to display results
    public void display() {
        EncapsulationDemo demo1 = new EncapsulationDemo();
        int result = demo1.x + demo1.y + demo1.z;
        System.out.println("Result: " + result);

        System.out.println("Display method called");
    }

    // Static method to display results
    public static void staticDisplay() {
        EncapsulationDemo demo = new EncapsulationDemo();
        EncapsulationDemo demo1 = new EncapsulationDemo();

        int result = demo.x + demo.y + demo.z;
        int result1 = demo1.x + demo1.y + demo1.z;
        System.out.println("Result: " + result);
        System.out.println("Static display method called");
    }
}


//In the given code, the `Person` class is an example of encapsulation. The `name` variable is declared as `private`, which means it can only be accessed within the `Person` class itself. This is the data that we want to protect.

// The `getName()` and `setName()` methods are the only ways to access and modify the `name` variable. These methods are the interface through which the outside world can interact with the `name` variable. By controlling access to the `name` variable through these methods, we can ensure that it is not modified accidentally or maliciously.

// For example, the `setName()` method could be modified to include validation logic, such as checking that the new name is not null or empty. This would prevent the `name` variable from being set to an invalid value. Similarly, the `getName()` method could be modified to return a copy of the `name` variable, rather than the original variable itself. This would prevent the outside world from modifying the `name` variable directly.

// By encapsulating the `name` variable within the `Person` class, we can ensure that it is used correctly and safely. This is the main benefit of encapsulation: it allows us to hide the implementation details of an object from the outside world, and to control access to its data through a well-defined interface.

