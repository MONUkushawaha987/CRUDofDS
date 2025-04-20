public class ArrayUpdate {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};
        
        System.out.println("Original array:");
        printArray(colors);
        
        // Update single element
        colors[1] = "Lime"; // Change Green to Lime
        System.out.println("\nAfter updating index 1:");
        printArray(colors);
        
        // Update multiple elements
        colors[3] = "Gold";
        colors[4] = "White";
        System.out.println("\nAfter updating multiple elements:");
        printArray(colors);
        
        // Update based on condition
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals("Blue")) {
                colors[i] = "Navy Blue";
            }
        }
        System.out.println("\nAfter conditional update:");
        printArray(colors);
    }
    
    private static void printArray(String[] arr) {
        for (String item : arr) {
            System.out.print(item + " ");
        }
    }
}