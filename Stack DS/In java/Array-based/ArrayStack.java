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
}