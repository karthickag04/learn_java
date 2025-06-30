

class University{

    private String universityName; // Private variable
    private String universityLocation; // Private variable

    public String universityName01; // Private variable
    public String universityLocation01; // Private variable

    public void setUniversityName(String name) {
        this.universityName = name; // Setter method for universityName
    }

    public String getUniversityName() {
        return this.universityName; // Getter method for universityName
    }


}







public class EncapsulationDemo02 extends University {



    public static void main(String[] args) {
}

    public void setUniversityName(String name) {
        super.universityName01 = name; // Setter method for universityName
        super.setUniversityName(name); // Using the setter method from the superclass
    }
        
     
}