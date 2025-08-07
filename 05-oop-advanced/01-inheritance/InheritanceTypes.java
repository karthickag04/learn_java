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



// In the given code, the `University` class is the parent class, and the `College1`, `College2`, and `Department` classes are the child classes. The `College1` and `College2` classes inherit the properties and behavior of the `University` class, and the `Department` class inherits the properties and behavior of the `College1` class.

// The `University` class has a private variable `name` and two public methods `getName()` and `setName()`. The `College1`, `College2`, and `Department` classes inherit these properties and behavior from the `University` class.

// The `College1` and `College2` classes also have their own private variable `collegeName` and two public methods `getCollegeName()` and `setCollegeName()`. This is an example of how a child class can add new properties and behavior to the ones it inherits from its parent class.

// The `Department` class also has its own private variable `departmentName` and two public methods `getDepartmentName()` and `setDepartmentName()`. This is an example of how a child class can add new properties and behavior to the ones it inherits from its parent class.

// The `Department` class also overrides the `getName()` method of the `University` class. This is an example of how a child class can provide its own implementation of a method that is already defined in its parent class.

// The `SubDepartment` class is an example of multilevel inheritance, where it inherits the properties and behavior of the `Department` class. {
    
}
