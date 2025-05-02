# Learn Java - Sessions Overview

## Setting Up Java on Windows

### Step 1: Download Java SE
- Visit the official Oracle website to download Java SE: [Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)
- Choose the appropriate version for your operating system and download the installer.
- if Windows select (Winodws) and download .msi or .exe file

### Step 2: Install Java
- Run the downloaded installer and follow the on-screen instructions to install Java.

### Step 3: Add `bin` Folder to Environment Variables
1. Locate the installation directory of Java (e.g., `C:\Program Files\Java\jdk-XX.X.X`).
2. Inside the installation directory, find the `bin` folder (e.g., `C:\Program Files\Java\jdk-XX.X.X\bin`).
3. Copy the path to the `bin` folder.

4. Add the path to the `bin` folder to the `Path` environment variable:
   - Open the Start menu and search for "Environment Variables."
   - Click on "Edit the system environment variables."
   - In the System Properties window, click on the "Environment Variables" button.
   - Under "System variables," find the `Path` variable and click "Edit."
   - Click "New" and paste the copied path to the `bin` folder.
   - Click "OK" to save the changes.

### Step 4: Verify Installation
- Open a Command Prompt and type `java -version` to verify that Java is installed correctly.
- Type `javac -version` to verify that the Java compiler is installed correctly.

---

## Session 00: Basics of Java

### Files and Explanations

1. **`Java_syntax.java`**
   - Covers basic Java syntax, including the use of curly braces `{}`, parentheses `()`, and comments.
   - Includes simple examples of addition and subtraction methods.
     
2. **`JavaVariables.java`**
   - Explains different types of variables in Java, including primitive, reference, array, enum, and more.
   - Demonstrates variable declaration, initialization, and usage.

3. **`Java_data_types.java`**
   - Explains Java's primitive data types (e.g., `int`, `float`, `boolean`) and their usage.
   - Demonstrates arrays and their initialization.

4. **`JavaOperators.java`**
   - Lists and explains various operators in Java, such as arithmetic, assignment, comparison, logical, and bitwise operators.
   - Provides syntax and examples for each operator.

5. **`ArithmaticProgram.java`**
   - Demonstrates arithmetic operations (`+`, `-`, `*`, `/`, `%`) in Java.
   - Includes examples of addition, subtraction, multiplication, division, and modulus.

6. **`RelationalOperatorsProgram.java`**
   - Demonstrates the use of relational operators (`>`, `<`, `>=`, `<=`, `==`, `!=`) in Java.
   - Includes examples of comparing integers and characters.

7. **`ConditionalProgram.java`**
   - Demonstrates conditional statements (`if-else`, nested `if`, and ternary operator).
   - Includes examples of checking positive, negative, or zero values.


8. **`chatreference.txt`**
   - Contains a reference link to a chat resource on OOP concepts in Java.

---

## Session 01: Methods in Java

### Files and Explanations

1. **`SessionOnVoidMethod.java`**
   - Demonstrates void methods in Java, which perform actions without returning a value.
   - Includes examples of printing messages using void methods.

2. **`SessionOnReturnTypeMethod.java`**
   - Explains return-type methods in Java, which return specific values.
   - Includes examples of methods that return integers and strings.

3. **`MethodDemo.java`**
   - Demonstrates the use of methods with and without return types.
   - Includes examples of conditional checks based on method results.

4. **`JavaMethodDemo.java`**
   - Explains method usage, including void methods and return-type methods.
   - Demonstrates method calls and conditional logic based on returned values.

5. **`Method_task.txt`**
   - Contains tasks for implementing a calculator using both void and return-type methods.
   - Includes instructions for addition, subtraction, multiplication, division, and modulus operations.

---

## Session 02: Classes and Objects

### Files and Explanations

1. **`ClassAndObject.java`**
   - Demonstrates the creation of classes and objects in Java.
   - Includes examples of calling methods from different classes.

2. **`ClassAndObjectsExample2.java`**
   - Explains void methods and methods with return types.
   - Includes examples of arithmetic operations using methods.

3. **`ConstructorDemo.java`**
   - Demonstrates the use of constructors in Java.
   - Includes examples of parameterized and default constructors.

4. **`Task_01.txt`**
   - Contains tasks for creating classes like `Book`, `Employee`, `Car`, and `BankAccount`.
   - Includes instructions for implementing methods and managing objects.

---

## Session 03: Method Overloading and Constructors

### Files and Explanations

1. **`MethodOverloadingExample.java`**
   - Demonstrates method overloading in Java.
   - Includes examples of methods with the same name but different parameters.

2. **`ConstructorDemo.java`**
   - Explains the use of constructors in Java.
   - Includes examples of calling constructors with and without parameters.

---

## Session 04: OOP Concepts - Polymorphism, Inheritance, and Encapsulation

### Files and Explanations

1. **`PolyFirstDemo.java`**
   - Demonstrates compile-time polymorphism using method overloading.
   - Includes examples of overloaded methods with different parameter types.

2. **`PolyDemo.java`**
   - Explains runtime polymorphism using method overriding.
   - Includes examples of polymorphic behavior with parent and child classes.

3. **`PolyCalculatorMethodOverriding.java`**
   - Demonstrates method overriding in a calculator program.
   - Includes examples of addition, subtraction, multiplication, and division.

4. **`PolyCalculatorMethodOverloading.java`**
   - Demonstrates method overloading in a calculator program.
   - Includes examples of overloaded methods for arithmetic operations.

5. **`InheritanceDemo.java`**
   - Explains inheritance in Java.
   - Includes examples of parent and child classes with overridden methods.

6. **`InheritanceTypesDemo.java`**
   - Demonstrates different types of inheritance (single, multilevel, hierarchical).
   - Includes examples of class hierarchies.

7. **`EncapsulationDemo.java`**
   - Explains encapsulation in Java.
   - Includes examples of private fields and public getter/setter methods.

8. **`AbstractionDemo.java`**
   - Demonstrates abstraction using abstract classes and methods.
   - Includes examples of hiding implementation details.

9. **`Task.txt`**
   - Contains tasks for implementing OOP concepts like inheritance, encapsulation, and polymorphism.
   - Includes instructions for creating classes like `Student`, `Vehicle`, and `Shape`.

10. **`Task_Poly.txt`**
    - Contains tasks for demonstrating polymorphism using method overloading and overriding.
    - Includes examples of classes like `Printer`, `Animal`, and `Shape`.

---

## How to Use
1. Open the `.java` files in your favorite IDE or text editor.
2. Compile and run the programs to see the output and understand the concepts.
3. Refer to the `.txt` files for additional exercises and tasks.

Happy Learning!
