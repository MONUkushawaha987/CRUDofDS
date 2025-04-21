import java.util.LinkedList;

public class LinkedListUpdate {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>() {{
            add("Java");
            add("Python");
            add("C++");
            add("JavaScript");
        }};
        
        System.out.println("Original: " + languages);
        
        // Update element by index
        languages.set(1, "Python 3");
        System.out.println("After updating index 1: " + languages);
        
        // Add element at specific position
        languages.add(2, "Ruby");
        System.out.println("After adding at index 2: " + languages);
        
        // Replace all elements (example: make all uppercase)
        languages.replaceAll(String::toUpperCase);
        System.out.println("After replaceAll: " + languages);
        
        // Swap two elements
        String temp = languages.get(0);
        languages.set(0, languages.get(3));
        languages.set(3, temp);
        System.out.println("After swapping first and last: " + languages);
    }
}