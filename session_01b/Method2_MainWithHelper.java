// Method2: Main in public class, logic in non-public helper class
public class Method2_MainWithHelper {
    // Note: This class only contains main, all logic is in Method2_HelperMethods (non-public)
    public static void main(String[] args) {
        System.out.println("[Method2_MainWithHelper] Main started");
        Method2_HelperMethods.staticVoidMethod();
        Method2_HelperMethods helper = new Method2_HelperMethods();
        helper.instanceVoidMethod();
        helper.anotherInstanceVoidMethod();
    }
}
class Method2_HelperMethods {
    // Note: This is a non-public helper class for static and non-static methods
    public static void staticVoidMethod() {
        System.out.println("[Method2_HelperMethods] This is a static void method.");
        anotherStaticVoidMethod();
    }
    public static void anotherStaticVoidMethod() {
        System.out.println("[Method2_HelperMethods] This is another static void method.");
    }
    public void instanceVoidMethod() {
        System.out.println("[Method2_HelperMethods] This is an instance void method.");
        anotherInstanceVoidMethod();
    }
    public void anotherInstanceVoidMethod() {
        System.out.println("[Method2_HelperMethods] This is another instance void method.");
    }
}
// Notes for trainees:
// - Method 2: Main in public class, logic in non-public helper class (Method2_MainWithHelper & Method2_HelperMethods)

