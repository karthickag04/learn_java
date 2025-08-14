import java.util.LinkedList;

/**
 * LinkedList Example - Doubly Linked List
 * Good for frequent insertions and deletions
 */
public class LinkedListExample {
    public static void main(String[] args) {
        System.out.println("=== LinkedList Example ===");
        
        // Creating a LinkedList of Strings
        LinkedList<String> animals = new LinkedList<>();
        
        // Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        
        System.out.println("Animals: " + animals);
        
        // Adding at specific positions
        animals.addFirst("Lion");  // Add at beginning
        animals.addLast("Elephant");  // Add at end
        animals.add(2, "Tiger");  // Add at index 2
        
        System.out.println("After additions: " + animals);
        
        // Accessing elements
        System.out.println("First animal: " + animals.getFirst());
        System.out.println("Last animal: " + animals.getLast());
        System.out.println("Animal at index 2: " + animals.get(2));
        
        // Removing elements
        animals.removeFirst();
        animals.removeLast();
        animals.remove("Cat");
        
        System.out.println("After removals: " + animals);
        
        // LinkedList as Queue (FIFO - First In, First Out)
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("First");  // Add to rear
        queue.offer("Second");
        queue.offer("Third");
        
        System.out.println("\nQueue operations:");
        System.out.println("Queue: " + queue);
        System.out.println("Poll (remove first): " + queue.poll());
        System.out.println("After poll: " + queue);
        System.out.println("Peek (view first): " + queue.peek());
        
        // LinkedList as Stack (LIFO - Last In, First Out)
        LinkedList<String> stack = new LinkedList<>();
        stack.push("Bottom");
        stack.push("Middle");
        stack.push("Top");
        
        System.out.println("\nStack operations:");
        System.out.println("Stack: " + stack);
        System.out.println("Pop (remove top): " + stack.pop());
        System.out.println("After pop: " + stack);
    }
}
