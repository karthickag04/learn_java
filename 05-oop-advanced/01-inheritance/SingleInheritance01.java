/**
 * 1. Single Inheritance:
 * This class 'University' acts as the Base (Parent) class in this single
 * inheritance model.
 * Single inheritance is where a subclass inherits from only one superclass.
 */
class University {
    /**
     * 2. Access Modifier (Public):
     * 'public' variables can be accessed directly from any other class in the
     * project.
     */
    public String universityName01;
    public String universityLocation01;

    /**
     * 3. Encapsulation & Access Modifier (Private):
     * 'private' variables are hidden from other classes.
     * This is the core of Encapsulation - bundling data (fields) and methods that
     * operate
     * on the data, and restricting direct access to some of the object's
     * components.
     */
    private String universityName;
    private String universityLocation;

    /**
     * 4. Getters (Public):
     * These provide a controlled way to read (access) the private fields from
     * outside the class.
     */
    public String getUniversityName() {
        return universityName;
    }

    public String getUniversityLocation() {
        return universityLocation;
    }

    /**
     * 5. Setters (Public):
     * These provide a controlled way to write (modify) the private fields from
     * outside the class.
     */
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setUniversityLocation(String universityLocation) {
        this.universityLocation = universityLocation;
    }

}

/**
 * 6. Single Inheritance:
 * 'SingleInheritance01' is the Derived (Child) class.
 * It uses the 'extends' keyword to inherit all public properties and behaviors
 * from the 'University' class.
 */
public class SingleInheritance01 extends University {

    public static void main(String[] inputs) {

        /**
         * 7. Creating an instance of the Parent class.
         */
        University univ = new University();

        // 8. Directly accessing public members of the parent class.
        univ.universityName01 = "Osmania University";
        univ.universityLocation01 = "Hyderabad";

        System.out.println("University directly accessed (Public): " + univ.universityName01);
        System.out.println("Location directly accessed (Public): " + univ.universityLocation01);

        /**
         * 9. Creating an instance of the Child class.
         * Notice that it has access to its own properties AND anything inherited from
         * 'University'.
         */
        SingleInheritance01 univer = new SingleInheritance01();

        // 10. Direct access to inherited public fields.
        univer.universityName01 = "Osmania University";
        univer.universityLocation01 = "Hyderabad";
        System.out.println("\nInherited Child Object (Public): " + univer.universityName01);
        System.out.println("Inherited Child Object Location (Public): " + univer.universityLocation01);

        /**
         * 11. Demonstrating Encapsulation:
         * Accessing private fields of the parent class via inherited public Getters and
         * Setters.
         * The child class cannot access 'private' fields of 'University' directly, but
         * it
         * inherits the public methods that work with those fields.
         */
        univer.setUniversityName("BDU University");
        univer.setUniversityLocation("Trichy");
        System.out.println("\nAccessing via Encapsulation (Getters):");
        System.out.println("University Name: " + univer.getUniversityName());
        System.out.println("University Location: " + univer.getUniversityLocation());

    }

}
