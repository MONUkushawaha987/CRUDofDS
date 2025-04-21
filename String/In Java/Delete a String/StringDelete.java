public class StringDelete {
    public static void main(String[] args) {
        String text = "Java is a powerful programming language";
        
        // Remove specific character (all occurrences)
        String withoutA = text.replace("a", "");
        System.out.println("After removing 'a': " + withoutA);
        
        // Remove substring (first occurrence)
        String withoutPowerful = text.replaceFirst("powerful ", "");
        System.out.println("After removing 'powerful': " + withoutPowerful);
        
        // Remove leading and trailing spaces (already shown in Update)
        
        // Remove specific word
        String withoutProgramming = text.replace(" programming", "");
        System.out.println("After removing 'programming': " + withoutProgramming);
        
        // Using substring to "delete" parts
        String firstPart = text.substring(0, 10); // "Java is a "
        String lastPart = text.substring(19); // "language"
        String combined = firstPart + lastPart;
        System.out.println("After deleting middle part: " + combined);
    }
}