public class StringRead {
    public static void main(String[] args) {
        String text = "Java Programming";
        
        // Getting string length
        System.out.println("Length: " + text.length());
        
        // Accessing characters
        System.out.println("Character at index 5: " + text.charAt(5));
        
        // Getting substring
        System.out.println("Substring (0-4): " + text.substring(0, 4));
        System.out.println("Substring from index 5: " + text.substring(5));
        
        // Finding index of characters/strings
        System.out.println("Index of 'P': " + text.indexOf('P'));
        System.out.println("Index of \"Pro\": " + text.indexOf("Pro"));
        
        // Checking if string contains substring
        System.out.println("Contains \"gram\"? " + text.contains("gram"));
    }
}