// Method3: Main and Helper are both public classes, in separate files
public class Method3_MainSeparate {
    // Note: This class only contains main, all logic is in Method3_HelperSeparate (public)
    public static void main(String[] args) {
        System.out.println("[Method3_MainSeparate] Main started");
        Method3_HelperSeparate.staticVoidMethod();
        Method3_HelperSeparate helper = new Method3_HelperSeparate();
        helper.instanceVoidMethod();
        helper.anotherInstanceVoidMethod();
    }
}
// Notes for trainees:
// - This scenario demonstrates fully separated public classes for main and logic.
