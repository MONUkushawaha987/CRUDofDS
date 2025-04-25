import java.util.LinkedList;
import java.util.Queue;

public class QueueUpdate {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>() {{
            add(10);
            add(20);
            add(30);
            add(40);
        }};
        
        System.out.println("Original Queue: " + queue);
        
        // Since Queue is FIFO, we can't directly update elements in the middle
        // We need to dequeue, modify, and enqueue back
        
        // Method to update first element
        if (!queue.isEmpty()) {
            int first = queue.poll(); // remove
            queue.add(first * 2);    // modify and add back
        }
        
        System.out.println("After updating first element: " + queue);
        
       
        
        // Alternative approach for specific position (not recommended for Queue)
        // Convert to array, update, and rebuild queue
        Integer[] arr = queue.toArray(new Integer[0]);
        arr[2] = 100; // update 3rd element
        queue.clear();
        for (int num : arr) {
            queue.add(num);
        }
        
        System.out.println("After updating specific position: " + queue);
    }
}