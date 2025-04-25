import java.util.LinkedList;
import java.util.Queue;

public class QueueCreate {
    public static void main(String[] args) {
        // Create a Queue using LinkedList implementation
        Queue<Integer> queue = new LinkedList<>();
        
        // Add elements to the queue (enqueue)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        
        System.out.println("Queue created: " + queue);
        
       
    }
}