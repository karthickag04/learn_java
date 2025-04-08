// Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows objects of different classes to be treated as objects of a common superclass.


class Person {
    private String name;

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to set the name (this will be overridden in subclasses)
    public void setName(String newName) {
        this.name = newName;
    }
}

class Employee extends Person {
    private String department;

    // Constructor
    public Employee(String name, String department) {
        setName(name); // Calls the overridden setName() method
        this.department = department;
    }

    // Method to get the department
    public String getDepartment() {
        return department;
    }

    @Override
    public void setName(String newName) {
        // Overriding setName() for Employee
        super.setName("Employee: " + newName); // Adding prefix for illustration
    }
}

class Customer extends Person {
    private String address;

    // Constructor
    public Customer(String name, String address) {
        setName(name); // Calls the overridden setName() method
        this.address = address;
    }

    // Method to get the address
    public String getAddress() {
        return address;
    }

    
    @Override
    public void setName(String newName) {
        // Overriding setName() for Customer
        super.setName("Customer: " + newName); // Adding prefix for illustration
    }
}

public class PolyDemo {
    public static void main(String[] args) {
        // Using runtime polymorphism
        Person person1 = new Employee("John Doe", "Sales");
        Person person2 = new Customer("Jane Doe", "123 Main St");

        // Polymorphic method call based on the actual object type
        person1.setName("John Smith"); // Calls Employee's setName
        person2.setName("Jane Smith"); // Calls Customer's setName

        // Print out the names using the overridden method at runtime
        System.out.println("Employee Name: " + person1.getName());
        System.out.println("Customer Name: " + person2.getName());

      
    }
}








































// In the given code, the `Person` class is an example of polymorphism. The `getName()` and `setName()` methods are declared in the `Person` class and implemented differently in the `Employee` and `Customer` classes. This is the interface through which the outside world can interact with the `Person` class. By providing this interface, we can ensure that any subclass of `Person` will have a consistent way of getting and setting the name.

// The `Employee` and `Customer` classes are concrete implementations of the `Person` class. They provide the actual implementation of the `getName()` and `setName()` methods. This is the internal detail that is hidden from the outside world.

// By using polymorphism, we can ensure that the outside world only sees the necessary information, which is the interface provided by the `Person` class. This is the main benefit of polymorphism: it allows us to hide the implementation details of an object from the outside world, and to provide a consistent interface through which the outside world can interact with the object.

// For example, we could create another subclass of `Person` that implements the `getName()` and `setName()` methods differently. This would allow us to have different implementations of the `Person` class without changing the interface through which the outside world interacts with it.
