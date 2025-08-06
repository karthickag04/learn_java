public class ConstructorDemo01 {
    public static void main(String[] args) {
        ConstructorNewDemoClass obj = new ConstructorNewDemoClass();
        // obj.printUserDetails();
        ConstructorNewDemoClass obj2 = new ConstructorNewDemoClass("Alice", 25);
        // obj2.printUserDetails();

    }
    
}


class ConstructorNewDemoClass{

    String userName = "no user name";
    int userAge = 0;

    public ConstructorNewDemoClass(){
        userName = "John Doe";
        userAge = 30;
        // printUserDetails();
    }
    public ConstructorNewDemoClass(String name, int age){
        userName = name;
        userAge = age;
        // printUserDetails();
    }


    public void printUserDetails() {
        System.out.println("User details are printed here.");
        System.out.println("User Name:" + userName);
        System.out.println("User Age: " + userAge);
    }

}