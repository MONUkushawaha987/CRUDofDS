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
        
       
    }
}