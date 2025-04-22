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
 // READ - Peek at top element
 public int peek() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
    }
    System.out.println("Top element is: " + stackArray[top]);
    return stackArray[top];
}

 // UPDATE - Modify element at position (non-standard stack operation)
 public void update(int position, int newValue) {
    if (position < 0 || position > top) {
        System.out.println("Invalid position");
        return;
    }
    System.out.println("Updating position " + position + " from " + 
                      stackArray[position] + " to " + newValue);
    stackArray[position] = newValue;
}
// DELETE - Pop element from stack
public int pop() {
    if (isEmpty()) {
        System.out.println("Stack underflow");
        return -1;
    }
    int value = stackArray[top--];
    System.out.println("Popped " + value + " from stack");
    return value;
}

// Utility methods
public boolean isEmpty() {
    return (top == -1);
}

public boolean isFull() {
    return (top == maxSize - 1);
}

public void display() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return;
    }
    System.out.print("Stack (top to bottom): ");
    for (int i = top; i >= 0; i--) {
        System.out.print(stackArray[i] + " ");
    }
    System.out.println();
}

}