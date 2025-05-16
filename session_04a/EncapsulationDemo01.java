class Person {
   
    private String cellphone; // Private variable to store the cellphone number securely
    public String cellphone01; // Public variable (not recommended for sensitive data)
        
    // Getter method to access the private cellphone variable
    public String getCellphone() {
        return cellphone;
    }

    // Setter method to modify the private cellphone variable
    public void setCellphone(String newCellphone) {
        this.cellphone = newCellphone;
    }
    
}

public class EncapsulationDemo01 extends Person {

    public static void main(String[] args) {

        // Creating an instance of EncapsulationDemo01
        EncapsulationDemo01 demo = new EncapsulationDemo01();

        // Using the setter method to set the private cellphone variable
        demo.setCellphone("123-456-7890");

        // Directly accessing the public variable (not secure)
        demo.cellphone01 = "098-765-4321";

        // Printing the private cellphone variable using the getter method
        System.out.println("Person's cellphone: " + demo.getCellphone());
    }
}
