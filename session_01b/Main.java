// Method1: All logic in one public class
public class Main {
    // Note: This class contains main, static, and non-static methods all together.
    public static void main(String[] args) {
        System.out.println("[Method1_AllMethodsDemo] Main started");
        staticVoidMethod();
        Main demo = new Main();
        demo.instanceVoidMethod();
        demo.anotherInstanceVoidMethod();
    }
    public static void staticVoidMethod() {
        System.out.println("[Method1_AllMethodsDemo] This is a static void method.");
        anotherStaticVoidMethod();
    }
    public static void anotherStaticVoidMethod() {
        System.out.println("[Method1_AllMethodsDemo] This is another static void method.");
    }
    public void instanceVoidMethod() {
        System.out.println("[Method1_AllMethodsDemo] This is an instance void method.");
        anotherInstanceVoidMethod();
    }
    public void anotherInstanceVoidMethod() {
        System.out.println("[Method1_AllMethodsDemo] This is another instance void method.");
    }
}
// Notes for trainees:
// - Method 1: All logic in one class (Method1_AllMethodsDemo)
