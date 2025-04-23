public class LinkedListStack {

    private class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
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
    

    
    }
    
}