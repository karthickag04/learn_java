/**
 * This class demonstrates the use of interfaces in Java.
 * It shows how a single class can implement multiple interfaces
 * and how objects of that class can be treated as instances of those interfaces.
 */
public class InterfaceDemo01 {

    /**
     * The main method is the entry point of the program.
     * It demonstrates:
     * 1. Creating an object of a class that implements multiple interfaces.
     * 2. Assigning that object to references of each interface type.
     * 3. Calling methods defined in the interfaces through these references.
     * 4. Calling methods directly on an object of the implementing class.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an instance of BHC and assign it to an AnnaUniversity interface reference.
        // This means auMember can only access methods declared in AnnaUniversity (and Object class).
        AnnaUniversity auMember = new BHC();
        auMember.setName01("Anna University"); // Calls setName01 specific to AnnaUniversity's contract
        System.out.println(auMember.getName()); // Calls getName, which is common but resolved via AnnaUniversity interface


        // Create another instance of BHC and assign it to a BharadhidasanUniversity interface reference.
        // This means buMemeber can only access methods declared in BharadhidasanUniversity (and Object class).
        // Note: "buMemeber" has a typo, likely intended to be "buMember".
        BharadhidasanUniversity buMemeber = new BHC();
        buMemeber.setName("Bharadhidasan University"); // Calls setName specific to BharadhidasanUniversity's contract
        System.out.println(buMemeber.getName()); // Calls getName, which is common but resolved via BharadhidasanUniversity interface

        // Create an instance of BHC and assign it to a BHC class reference.
        // This means bhc can access all public methods of the BHC class,
        // including those from both implemented interfaces.
        BHC bhc = new BHC();
        // Calling getName01 directly on the BHC object.
        // Note: This call to getName01() doesn't do much as the return value is not used or printed,
        // and the CollegeName might not have been set for this specific 'bhc' instance yet
        // unless a setName or setName01 method was called on it prior.
        bhc.getName01();

    }

    
}

/**
 * Interface representing a contract for entities associated with Bharadhidasan University.
 * It defines methods for setting and getting a name.
 */
interface BharadhidasanUniversity {

    /**
     * Sets the name for the university entity.
     * @param name The name to be set.
     */
    void setName(String name);
    
    /**
     * Gets the name of the university entity.
     * @return The name.
     */
    String getName();
   
}


/**
 * Interface representing a contract for entities associated with Anna University.
 * It defines methods for setting and getting a name, with a slightly different
 * method name for setting the name (`setName01`) to differentiate or for specific reasons.
 */
interface AnnaUniversity {
    /**
     * Sets the name for the university entity (method specific to AnnaUniversity interface).
     * @param name The name to be set.
     */
    void setName01(String name);

    /**
     * Gets the name of the university entity.
     * This method signature is common with BharadhidasanUniversity.
     * @return The name.
     */
    String getName();
}

/**
 * The BHC class (presumably representing a college, e.g., "Bishop Heber College")
 * implements both BharadhidasanUniversity and AnnaUniversity interfaces.
 * This means it must provide concrete implementations for all methods declared in both interfaces.
 */
class BHC implements BharadhidasanUniversity, AnnaUniversity {

    // Private field to store the college name. This single field will be used
    // by the setter methods from both interfaces.
    private String CollegeName;


    /**
     * Implementation of the setName method from the BharadhidasanUniversity interface.
     * It sets the CollegeName.
     * @param name The name to set for the college.
     */
    @Override
    public void setName(String name) {
        this.CollegeName = name;
    }

    /**
     * Implementation of the setName01 method from the AnnaUniversity interface.
     * It also sets the CollegeName, demonstrating that different interface methods
     * can manipulate the same underlying data if designed that way.
     * @param name The name to set for the college.
     */
    @Override
    public void setName01(String name) {
        this.CollegeName = name;
    }

    
    /**
     * Implementation of the getName method, required by both BharadhidasanUniversity
     * and AnnaUniversity interfaces. Since the method signature is identical in both,
     * a single implementation suffices.
     * @return The current value of CollegeName.
     */
    @Override // This @Override annotation is technically for one of the interfaces,
              // but it satisfies the contract for both due to the identical signature.
    public String getName() {
        return CollegeName;
    }

    /**
     * This is an additional public method in the BHC class.
     * It's not part of either BharadhidasanUniversity or AnnaUniversity interfaces.
     * It also returns the CollegeName.
     * This method could be called if you have a reference of type BHC.
     * @return The current value of CollegeName.
     */
    public String getName01() {
        return CollegeName;
    }
}
