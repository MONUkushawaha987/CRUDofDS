public class ArrayCreate {
    public static void main(String[] args) {
        // Method 1: Initialize with values
        String[] fruits = {"Apple", "Banana", "Orange"};
        System.out.println("Array created with initial values:");
        printArray(fruits);
        
        // Method 2: Initialize with size then assign values
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println("\nArray created with size then populated:");
        printArray(numbers);
    }
    
    // Helper method to print string array
    private static void printArray(String[] arr) {
        for (String item : arr) {
            System.out.print(item + " ");
        }
    }
    
    // Helper method to print int array
    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}