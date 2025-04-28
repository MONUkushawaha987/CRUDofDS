import java.util.HashMap;

public class HashMapUpdate {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        
        // Update existing entry
        studentScores.put("Bob", 90); // Overwrites the previous value
        
        // Update only if key exists
        studentScores.replace("Alice", 97);
        
        // Update only if key doesn't exist
        studentScores.putIfAbsent("Charlie", 85);
        
       
    }
}