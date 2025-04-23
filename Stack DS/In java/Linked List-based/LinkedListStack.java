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
    
    }
    
}