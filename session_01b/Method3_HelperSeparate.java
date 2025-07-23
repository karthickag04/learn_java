// Method3: Public helper class for logic, used by Method3_MainSeparate
public class Method3_HelperSeparate {
    // Note: This is a public helper class for static and non-static methods
    public static void staticVoidMethod() {
        System.out.println("[Method3_HelperSeparate] This is a static void method.");
        anotherStaticVoidMethod();
    }
    public static void anotherStaticVoidMethod() {
        System.out.println("[Method3_HelperSeparate] This is another static void method.");
    }
    public void instanceVoidMethod() {
        System.out.println("[Method3_HelperSeparate] This is an instance void method.");
        anotherInstanceVoidMethod();
    }
    public void anotherInstanceVoidMethod() {
        System.out.println("[Method3_HelperSeparate] This is another instance void method.");
    }
}
// Notes for trainees:
// - This class is used by Method3_MainSeparate to demonstrate fully separated public classes.
