public class Inheritance1 {
    public static void main(String[] args) {
        System.out.println("Inheritance Example");
        System.out.println("************************");
        People p=new People();
        p.Admission();

    }
}



class College{

    public void Admission(){
        System.out.println("Admission Open");
    }

}

class People extends College{

    public void Admission(){
        super.Admission();
        System.out.println("Admitted in college");
    }

}