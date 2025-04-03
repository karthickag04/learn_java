// Encapsulation is a fundamental concept in object-oriented programming (OOP) that binds together the data and the methods that manipulate that data, 
// and keeps both safe from outside interference and misuse. In other words, it's a protective wrapper that prevents the data from being accessed by the code outside this wrapper.


// Access Specifiers in Java

// 1. Public: Accessible from anywhere in the program
// 2. Private: Accessible only within the same class
// 3. Protected: Accessible within the same class and subclasses
// 4. Default (no modifier): Accessible within the same class, subclasses, and classes in the same package




class Person {
    private String name; // Private variable
    
    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String newName) {
        this.name = newName;
    }
}



public class EncapsulationDemo {
    
    public static void main(String[] args) {
        Person p = new Person();
        
        p.setName("John"); // Setting the value
        System.out.println(p.getName()); // Getting the value
    }
}


//In the given code, the `Person` class is an example of encapsulation. The `name` variable is declared as `private`, which means it can only be accessed within the `Person` class itself. This is the data that we want to protect.

// The `getName()` and `setName()` methods are the only ways to access and modify the `name` variable. These methods are the interface through which the outside world can interact with the `name` variable. By controlling access to the `name` variable through these methods, we can ensure that it is not modified accidentally or maliciously.

// For example, the `setName()` method could be modified to include validation logic, such as checking that the new name is not null or empty. This would prevent the `name` variable from being set to an invalid value. Similarly, the `getName()` method could be modified to return a copy of the `name` variable, rather than the original variable itself. This would prevent the outside world from modifying the `name` variable directly.

// By encapsulating the `name` variable within the `Person` class, we can ensure that it is used correctly and safely. This is the main benefit of encapsulation: it allows us to hide the implementation details of an object from the outside world, and to control access to its data through a well-defined interface.
