import java.util.HashMap;

public class HashMapDelete {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 76);
        studentScores.put("Diana", 92);
        
        // Remove by key
        studentScores.remove("Charlie");
        System.out.println("After removing Charlie: " + studentScores);
        
        // Remove by key-value pair (only removes if both match)
        boolean isRemoved = studentScores.remove("Bob", 88);
        System.out.println("Was Bob removed? " + isRemoved);
        System.out.println("After removing Bob: " + studentScores);
        
        // Clear all entries
        studentScores.clear();
        System.out.println("After clear: " + studentScores);
    }
}