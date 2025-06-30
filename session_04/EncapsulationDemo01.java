

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


public class EncapsulationDemo01 {



    public static void main(String[] args) {

        University un=new University();
        un.universityName01 = "Bharadhidasan University"; // Accessing public variable
        System.out.println("University Name: " + un.universityName01);


        un.setUniversityName("Bharadhidasan University"); 

        System.out.println("University Name: " + un.getUniversityName());
    }
}




