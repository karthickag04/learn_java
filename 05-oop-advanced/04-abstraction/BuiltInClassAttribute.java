class Sample {
    private int x;
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class BuiltInClassAttribute {
    public static void main(String[] args) {
        // Get the Class object
        Class<?> cls = Sample.class;

        // Built-in class info
        System.out.println("Class Name: " + cls.getName());
        System.out.println("Simple Name: " + cls.getSimpleName());
        System.out.println("Package: " + cls.getPackage());
        System.out.println("Superclass: " + cls.getSuperclass());
        System.out.println("Is Interface? " + cls.isInterface());

        // Fields
        System.out.println("Declared Fields:");
        for (var field : cls.getDeclaredFields()) {
            System.out.println("  " + field.getName() + " (" + field.getType() + ")");
        }

        // Methods
        System.out.println("Declared Methods:");
        for (var method : cls.getDeclaredMethods()) {
            System.out.println("  " + method.getName());
        }
    }
}

