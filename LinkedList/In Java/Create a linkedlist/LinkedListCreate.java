import java.util.LinkedList;

public class LinkedListCreate {
    public static void main(String[] args) {
        // Creating an empty LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        
        // Adding elements to LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addFirst("Mango");  // Add to beginning
        fruits.addLast("Orange"); // Add to end
        
        // Creating LinkedList with initial values
        LinkedList<Integer> numbers = new LinkedList<>() {{
            add(10);
            add(20);
            add(30);
        }};
        
        System.out.println("Fruits LinkedList: " + fruits);
        System.out.println("Numbers LinkedList: " + numbers);
    }
}