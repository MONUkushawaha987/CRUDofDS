public class StringCreate {
    public static void main(String[] args) {
        // Different ways to create strings in Java
        String str1 = "Hello World"; // Using string literal
        String str2 = new String("Java Programming"); // Using new keyword
        char[] charArray = {'S', 't', 'r', 'i', 'n', 'g'};
        String str3 = new String(charArray); // From character array
        String str4 = String.valueOf(123.45); // From other data types
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
    }
}