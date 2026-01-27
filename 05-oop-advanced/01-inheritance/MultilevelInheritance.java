
class College {

    public void Admission() {
        System.out.println("Admission Open");
    }

    public void Facilities() {
        System.out.println("Facilities");
    }

}

class People extends College {

    public void Admission() {
        super.Admission();
        System.out.println("Admitted in college");
    }

    public void AdminssionProcess() {
        System.out.println("Admission Process");
    }

}

class Student extends People {

    public void Admission() {
        super.Admission();
        System.out.println("Admitted in college");
    }

}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // System.out.println("Inheritance Example");
        // System.out.println("************************");
        // People p = new People();
        // p.Admission();
        Student s = new Student();
        s.Admission();
        s.Facilities();

    }
}
