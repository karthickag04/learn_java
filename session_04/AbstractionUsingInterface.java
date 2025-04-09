
// Abstraction is a fundamental concept in object-oriented programming (OOP) that shows only the necessary information to the outside world while hiding the internal details. 

interface Person {
    // Abstract method to get the name
    String name=""; // Default value

    String getName();

    // Abstract method to set the name
    void setName(String newName);

    void setPass(String newPass);
}


interface Person1 {
    // Abstract method to get the name
    String name=""; // Default value

    String getEmail();

    // Abstract method to set the name
   

    void setEmail(String newPass);
}

// Concrete implementation of the Person interface
class ConcretePerson1 implements Person {

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


class ConcretePerson2 implements Person, Person1 {

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
    public String getEmail() {
        return name;
    }

    // Setter method
    @Override
    public void setEmail(String newName) {
        this.name = newName;
    }

    @Override
    public void setPass(String newName) {
        this.name = newName;
    }
}

public class AbstractionUsingInterface {
    public static void main(String[] args) {
        // Person person = new ConcretePerson1();
        // person.setName("John Doe");
        // System.out.println("Name: " + person.getName());
       
        Person person = new ConcretePerson2();
        person.setName("John Doe");
        
        Person1 person1 = new ConcretePerson2();
        System.out.println("Name: " + person.getName());
        System.out.println("Name: " + person1.getName());
    }
}

// In the given code, the `Person` interface is an example of abstraction. The `getName()` and `setName()` methods are declared as abstract, which means they must be implemented by any class that implements the `Person` interface. This is the interface through which the outside world can interact with the `Person` interface. By providing this interface, we can ensure that any class that implements `Person` will have a consistent way of getting and setting the name.

// The `ConcretePerson` class is a concrete implementation of the `Person` interface. It provides the actual implementation of the `getName()` and `setName()` methods. This is the internal detail that is hidden from the outside world.

// By abstracting the `Person` interface, we can ensure that the outside world only sees the necessary information, which is the interface provided by the `Person` interface. This is the main benefit of abstraction: it allows us to hide the implementation details of an object from the outside world, and to provide a consistent interface through which the outside world can interact with the object.

// For example, we could create another class that implements the `Person` interface and implements the `getName()` and `setName()` methods differently. This would allow us to have different implementations of the `Person` interface without changing the interface through which the outside world interacts with it.