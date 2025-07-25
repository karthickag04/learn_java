// Inheritance is a fundamental concept in object-oriented programming (OOP) that allows one class to inherit the properties and behavior of another class. 
// The class that is being inherited is called the parent or superclass, and the class that is doing the inheriting is called the child or subclass.

class University {
    private String name; // Private variable
    
    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String newName) {
        this.name = newName;
    }

    // New method
    public void printUniversityInfo() {
        System.out.println("University Name: " + name);
    }
}

class Department extends University {
    private String departmentName; // Private variable

    // Getter method
    public String getDepartmentName() {
        return departmentName;
    }

    // Setter method
    public void setDepartmentName(String newDepartmentName) {
        this.departmentName = newDepartmentName;
    }

    // Override the getName() method of the University class
    @Override
    public String getName() {
        return "Department's name is " + super.getName();
    }

    // New method that uses the printUniversityInfo() method
    public void printDepartmentInfo() {
        super.printUniversityInfo();
        System.out.println("Department Name: " + departmentName);
    }
}

public class SingleInheritance {
    
    public static void main(String[] args) {
       

        Department d = new Department();
        d.setName("Harvard"); // Setting the value
        d.setDepartmentName("Computer Science"); // Setting the value
        d.printDepartmentInfo(); // Getting the value
    }
}




// In the given code, the `University` class is the parent class, and the `Department` class is the child class. The `Department` class inherits the properties and behavior of the `University` class.

// The `University` class has a private variable `name` and two public methods `getName()` and `setName()`. The `Department` class inherits these properties and behavior from the `University` class.

// The `Department` class also has its own private variable `departmentName` and two public methods `getDepartmentName()` and `setDepartmentName()`. This is an example of how a child class can add new properties and behavior to the ones it inherits from its parent class.

// The `Department` class also overrides the `getName()` method of the `University` class. This is an example of how a child class can provide its own implementation of a method that is already defined in its parent class.





// Inheritance is useful when you want to create a new class that is a modified version of an existing class.
// In this case, the Department class is a type of University, so it makes sense to inherit the properties and behavior of the University class.

// If we didn't use inheritance, we would have to duplicate the code for the University class in the Department class.
// This would lead to code duplication and make it harder to maintain.

// For example, if we wanted to add a new method to the University class, we would have to add it to the Department class as well.
// But with inheritance, we can simply add the method to the University class and it will be available to the Department class.

// Here's an example of how we could use inheritance to add a new method to the University class: