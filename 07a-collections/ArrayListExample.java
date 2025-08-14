import java.util.ArrayList;
/**
 * ArrayList Example - Dynamic Array
 * ArrayList can grow and shrink in size automatically
 */

public class ArrayListExample {
    public static void main(String[] args) {

        System.out.println("=== ArrayList Example ===");
        
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        
        System.out.println("Fruits list: " + fruits);
        System.out.println("Size: " + fruits.size());
        
        // Accessing elements by index
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Last fruit: " + fruits.get(fruits.size() - 1));
        
        // Checking if element exists
        if (fruits.contains("Apple")) {
            System.out.println("Apple is in the list!");
        }
        
        // Removing elements
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        
        // Iterating through ArrayList
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

    
        // ArrayList with numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        System.out.println("\nNumbers: " + numbers);
        
        // Clear all elements
        numbers.clear();
        System.out.println("After clearing: " + numbers);
        System.out.println("Is empty? " + numbers.isEmpty());

    }
}
