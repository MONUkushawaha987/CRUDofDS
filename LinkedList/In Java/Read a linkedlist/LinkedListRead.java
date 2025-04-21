import java.util.LinkedList;

public class LinkedListRead {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>() {{
            add("Red");
            add("Green");
            add("Blue");
            add("Yellow");
        }};
        
        // Get elements
        System.out.println("First element: " + colors.getFirst());
        System.out.println("Last element: " + colors.getLast());
        System.out.println("Element at index 2: " + colors.get(2));
        
        // Check if element exists
        System.out.println("Contains 'Green'? " + colors.contains("Green"));
        
        // Get index of element
        System.out.println("Index of 'Blue': " + colors.indexOf("Blue"));
        
        // Size of LinkedList
        System.out.println("Size: " + colors.size());
        
        // Iterate through LinkedList
        System.out.println("\nAll elements:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}