// Abstraction is a fundamental concept in object-oriented programming (OOP) that shows only the necessary information to the outside world while hiding the internal details. 


abstract class Person {
    
    private String name; // Private variable

    // Abstract method to get the name
    public abstract String getName();

    // Abstract method to set the name
    public abstract void setName(String newName);

    public abstract void setPass(String newPass);
    
}

// Concrete implementation of the Person class
class ConcretePerson1 extends Person {
    private String name;

    // Getter method
    @Override
    public String getName() {
        return name;
    }

    // Setter method
    @Override
    public void setName(String newName) {
        this.name = newName;
    }
    @Override
    public void setPass(String newName) {
        this.name = newName;
    }
}
class ConcretePerson2 extends Person {
    private String name;

    // Getter method
    @Override
    public String getName() {
        return name;
    }

    // Setter method
    @Override
    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public void setPass(String newName) {
        this.name = newName;
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Person person = new ConcretePerson1();
        person.setName("John Doe");
        System.out.println("Name: " + person.getName());
    }
}











































// In the given code, the `Person` class is an example of abstraction. The `getName()` and `setName()` methods are declared as abstract, which means they must be implemented by any subclass of `Person`. This is the interface through which the outside world can interact with the `Person` class. By providing this interface, we can ensure that any subclass of `Person` will have a consistent way of getting and setting the name.

// The `ConcretePerson` class is a concrete implementation of the `Person` class. It provides the actual implementation of the `getName()` and `setName()` methods. This is the internal detail that is hidden from the outside world.

// By abstracting the `Person` class, we can ensure that the outside world only sees the necessary information, which is the interface provided by the `Person` class. This is the main benefit of abstraction: it allows us to hide the implementation details of an object from the outside world, and to provide a consistent interface through which the outside world can interact with the object.

// For example, we could create another subclass of `Person` that implements the `getName()` and `setName()` methods differently. This would allow us to have different implementations of the `Person` class without changing the interface through which the outside world interacts with it.
