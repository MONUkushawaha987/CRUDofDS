public class StringUpdate {
    public static void main(String[] args) {
        String original = "Hello Java";
        
        // Concatenation
        String updated = original + " World";
        System.out.println("After concatenation: " + updated);
        
        // Replace characters
        updated = updated.replace('a', 'X');
        System.out.println("After replacement: " + updated);
        
        // Convert case
        updated = updated.toUpperCase();
        System.out.println("Uppercase: " + updated);
        updated = updated.toLowerCase();
        System.out.println("Lowercase: " + updated);
        
        // Trim whitespace
        String withSpaces = "   Trim me   ";
        System.out.println("After trim: '" + withSpaces.trim() + "'");
        
        // Using StringBuilder for efficient modifications
        StringBuilder sb = new StringBuilder(original);
        sb.append(" World");
        sb.insert(5, ", ");
        sb.delete(11, 16);
        System.out.println("Using StringBuilder: " + sb.toString());
    }
}