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

    
}