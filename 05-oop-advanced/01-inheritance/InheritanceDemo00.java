public class InheritanceDemo00 {
    public static void main(String[] args) {
        System.out.println("Hello, Inheritance!");

        // Gtec gtec = new Gtec();
        // gtec.welcomeForEnquiry();
        // gtec.welcomeForAdmission();
        // gtec.welcomeForPlacement();


        // Student student = new Student();
        // student.welcomeForEnquiry();
        // student.welcomeForAdmission();
        // student.welcomeForPlacement();


        Parent parent = new Parent();
        parent.welcomeForEnquiry();
        parent.welcomeForAdmission();
        parent.welcomeForPlacement();
        parent.availableCourses();
        parent.labFacilities();
        parent.attendedClasses();
        
    }
}



class Gtec{

    public void welcomeForEnquiry() {
        System.out.println("Welcome to GTEC for your enquiry!");
    }

    public void welcomeForAdmission() {
        System.out.println("Welcome to GTEC for your admission!");
    }

    public void welcomeForPlacement() {
        System.out.println("Welcome to GTEC for your placement!");
    }

    public void availableCourses() {
        System.out.println("Available courses at GTEC: Java, Python, C++, Web Development.");
    }

    public void labFacilities() {
        System.out.println("GTEC provides state-of-the-art lab facilities for hands-on learning.");
    }


}


class Student extends Gtec {

    public void attendedClasses() {
        System.out.println("Student attended classes today.");
    }

  
}

class  Parent extends Student{}


