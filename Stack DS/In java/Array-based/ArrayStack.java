public class ArrayStack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize stack
    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
     // CREATE - Push element onto stack
     public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow - cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " to stack");
    }

}