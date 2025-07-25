// Types of Inheritance

// 1. Single Inheritance: 
//    - A child class inherits from only one parent class.

// 2. Multiple Inheritance: 
//    - A child class inherits from more than one parent class (not directly supported in Java, but can be achieved through interfaces).

// 3. Multilevel Inheritance: 
//    - A child class inherits from a parent class, which in turn inherits from another parent class.

// 4. Hierarchical Inheritance: 
//    - More than one child class inherits from the same parent class.

// 5. Hybrid Inheritance: 
//    - A combination of multiple inheritance and multilevel inheritance (not directly supported in Java, but can be achieved through interfaces).



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

class College1 extends University {
    private String collegeName; // Private variable

    // Getter method
    public String getCollegeName() {
        return collegeName;
    }

    // Setter method
    public void setCollegeName(String newCollegeName) {
        this.collegeName = newCollegeName;
    }

    // New method that uses the printUniversityInfo() method
    public void printCollegeInfo() {
        super.printUniversityInfo();
        System.out.println("College Name: " + collegeName);
    }
}

class College2 extends University {
    private String collegeName; // Private variable

    // Getter method
    public String getCollegeName() {
        return collegeName;
    }

    // Setter method
    public void setCollegeName(String newCollegeName) {
        this.collegeName = newCollegeName;
    }

    // New method that uses the printUniversityInfo() method
    public void printCollegeInfo() {
        super.printUniversityInfo();
        System.out.println("College Name: " + collegeName);
    }
}

class Department extends College1 {
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
        super.printCollegeInfo();
        System.out.println("Department Name: " + departmentName);
    }
}

// Example of Multilevel Inheritance
class SubDepartment extends Department {
    private String subDepartmentName; // Private variable

    // Getter method
    public String getSubDepartmentName() {
        return subDepartmentName;
    }

    // Setter method
    public void setSubDepartmentName(String newSubDepartmentName) {
        this.subDepartmentName = newSubDepartmentName;
    }

    // New method that uses the printDepartmentInfo() method
    public void printSubDepartmentInfo() {
        super.printDepartmentInfo();
        System.out.println("Sub Department Name: " + subDepartmentName);
    }
}

public class HierarchicalInheritance {
    
    public static void main(String[] args) {
        Department d = new Department();
        d.setName("Harvard"); // Setting the value
        d.setCollegeName("College of Engineering"); // Setting the value
        d.setDepartmentName("Computer Science"); // Setting the value
        d.printDepartmentInfo(); // Getting the value

        SubDepartment sd = new SubDepartment();
        sd.setName("Harvard"); // Setting the value
        sd.setCollegeName("College of Engineering"); // Setting the value
        sd.setDepartmentName("Computer Science"); // Setting the value
        sd.setSubDepartmentName("Artificial Intelligence"); // Setting the value
        sd.printSubDepartmentInfo(); // Getting the value

        College2 c = new College2();
        c.setName("Harvard"); // Setting the value
        c.setCollegeName("College of Science"); // Setting the value
        c.printCollegeInfo(); // Getting the value
    }
}


// In the given code, the `University` class is the parent class, and the `College1`, `College2`, and `Department` classes are the child classes. The `College1` and `College2` classes inherit the properties and behavior of the `University` class, and the `Department` class inherits the properties and behavior of the `College1` class.

// The `University` class has a private variable `name` and two public methods `getName()` and `setName()`. The `College1`, `College2`, and `Department` classes inherit these properties and behavior from the `University` class.

// The `College1` and `College2` classes also have their own private variable `collegeName` and two public methods `getCollegeName()` and `setCollegeName()`. This is an example of how a child class can add new properties and behavior to the ones it inherits from its parent class.

// The `Department` class also has its own private variable `departmentName` and two public methods `getDepartmentName()` and `setDepartmentName()`. This is an example of how a child class can add new properties and behavior to the ones it inherits from its parent class.

// The `Department` class also overrides the `getName()` method of the `University` class. This is an example of how a child class can provide its own implementation of a method that is already defined in its parent class.

// The `SubDepartment` class is an example of multilevel inheritance, where it inherits the properties and behavior of the `Department` class.
