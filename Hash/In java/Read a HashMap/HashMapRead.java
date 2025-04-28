import java.util.HashMap;

public class HashMapRead {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 76);
        
        // Get value by key
        int aliceScore = studentScores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);
        
        // Check if key exists
        boolean hasBob = studentScores.containsKey("Bob");
        System.out.println("Contains Bob? " + hasBob);
        
        // Check if value exists
        boolean hasScore88 = studentScores.containsValue(88);
        System.out.println("Contains score 88? " + hasScore88);
        
        
    }
}