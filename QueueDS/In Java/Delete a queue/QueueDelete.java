import java.util.LinkedList;
import java.util.Queue;

public class QueueDelete {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>() {{
            add("Red");
            add("Green");
            add("Blue");
            add("Yellow");
        }};
        
        System.out.println("Original Queue: " + queue);
        
        // 1. Remove and return front element (dequeue)
        String removed = queue.poll();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after poll(): " + queue);
        
         // 2. Remove specific element
         boolean removedGreen = queue.remove("Green");
         System.out.println("Removed 'Green'? " + removedGreen);
         System.out.println("Queue after remove(): " + queue);

         // 3. Clear entire queue
        queue.clear();
        System.out.println("Queue after clear(): " + queue);
       
    }
}