import java.util.LinkedList;
import java.util.Queue;

public class QueueRead {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>() {{
            add("Apple");
            add("Banana");
            add("Cherry");
            add("Date");
        }};
        
        // 1. Peek at the front element (without removing)
        System.out.println("Front element: " + queue.peek());
       
       // 2. Check if queue contains an element
       System.out.println("Contains 'Banana'? " + queue.contains("Banana"));
        
         // 3. Get queue size
         System.out.println("Queue size: " + queue.size());
       
       // 4. Print all elements (iteration)
        System.out.println("\nAll queue elements:");
        for (String fruit : queue) {
            System.out.println(fruit);
        }
        
         // 5. Check if queue is empty
         System.out.println("Is queue empty? " + queue.isEmpty());
    }
}