public class LinkedListStack {

    private class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
        private Node top;
        private int size;

    
        
        public LinkedListStack() {
            this.top = null;
            this.size = 0;
        }
         // CREATE - Push element onto stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed " + value + " to stack");
    }
     // READ - Peek at top element
     public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("Top element is: " + top.data);
        return top.data;
    }


     // UPDATE - Modify element at position (non-standard stack operation)
     public void update(int position, int newValue) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        
        Node current = top;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        System.out.println("Updating position " + position + " from " + 
                          current.data + " to " + newValue);
        current.data = newValue;
    }
    

     // DELETE - Pop element from stack
     public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        size--;
        System.out.println("Popped " + value + " from stack");
        return value;
    }

     // Utility methods
     public boolean isEmpty() {
        return top == null;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
 // Main method to test the stack
 public static void main(String[] args) {
    LinkedListStack stack = new LinkedListStack();
    
    // CRUD operations
    stack.push(100);  // Create
    stack.push(200);
    stack.push(300);
    
    stack.peek();     // Read
    
    stack.update(1, 250); // Update (changes 200 to 250)
    
    stack.pop();      // Delete
    stack.display();
}
}