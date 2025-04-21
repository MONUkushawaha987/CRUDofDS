import java.util.LinkedList;

public class LinkedListDelete {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>() {{
            add(10);
            add(20);
            add(30);
            add(40);
            add(50);
            add(20);
        }};
        
        System.out.println("Original: " + numbers);
        
        // Remove by index
        numbers.remove(2);
        System.out.println("After removing index 2: " + numbers);
        
        // Remove first occurrence of value
        numbers.removeFirstOccurrence(20);
        System.out.println("After removing first 20: " + numbers);
        
        // Remove first and last elements
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removing first and last: " + numbers);
        
        // Remove all elements that match condition (e.g., greater than 25)
        numbers.removeIf(n -> n > 25);
        System.out.println("After removeIf: " + numbers);
        
        // Clear the entire LinkedList
        numbers.clear();
        System.out.println("After clear: " + numbers);
    }
}