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
       
        // 4. Safe removal (check before remove)
        Queue<Integer> numQueue = new LinkedList<>() {{
            add(100);
            add(200);
        }};
        
        if (!numQueue.isEmpty()) {
            numQueue.remove();
        }
        System.out.println("After safe removal: " + numQueue);

        // 5. Remove all elements matching condition
        Queue<Integer> numbers = new LinkedList<>() {{
            add(15);
            add(25);
            add(30);
            add(35);
        }};
        numbers.removeIf(num -> num > 30); // remove numbers > 30
        System.out.println("After removeIf(): " + numbers);
    }
}