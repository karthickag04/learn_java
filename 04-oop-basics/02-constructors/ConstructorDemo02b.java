public class ConstructorDemo02b {

    public String first_name;
    public int age;

    public ConstructorDemo02b() {

        System.out.println("Default Constructor called");
        this.first_name = "ragu";
        this.age = 22;
    }

    public ConstructorDemo02b(String name, int age) {

        System.out.println("parameterized Constructor called");
        this.first_name = name;
        this.age = age;
    }

    public void printUserDetails() {
        System.out.println("User details are printed here.");
        System.out.println("User Name:" + this.first_name);
        System.out.println("User Age: " + this.age);
    }

    public static void main(String[] args) {
        ConstructorDemo02b obj = new ConstructorDemo02b();
        ConstructorDemo02b obj1 = new ConstructorDemo02b("raguvaran", 28);
        ConstructorDemo02b obj2 = new ConstructorDemo02b("raguvaran01", 30);
        obj.printUserDetails();
        obj1.printUserDetails();
        obj2.printUserDetails();
    }

}