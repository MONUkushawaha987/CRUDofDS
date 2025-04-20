public class ArrayDelete {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        
        System.out.println("Original array:");
        printArray(numbers);
        
        // Delete by creating a new array (since Java arrays are fixed size)
        int indexToDelete = 3; // Delete 40 (index 3)
        int[] newNumbers = new int[numbers.length - 1];
        
        // Copy elements before the index
        System.arraycopy(numbers, 0, newNumbers, 0, indexToDelete);
        
        // Copy elements after the index
        System.arraycopy(numbers, indexToDelete + 1, newNumbers, indexToDelete, 
                        numbers.length - indexToDelete - 1);
        
        System.out.println("\nAfter deleting index 3:");
        printArray(newNumbers);
        
        // Alternative: Mark as deleted (useful when you can't resize)
        Integer[] items = {100, 200, 300, 400, 500};
        int deleteIndex = 2; // Delete 300
        
        System.out.println("\nOriginal array before marking deletion:");
        printArray(items);
        
        items[deleteIndex] = null; // Mark as deleted
        
        System.out.println("\nAfter marking index 2 as deleted:");
        printArray(items);
    }
    
    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
    
    private static void printArray(Integer[] arr) {
        for (Integer item : arr) {
            System.out.print(item + " ");
        }
    }
}