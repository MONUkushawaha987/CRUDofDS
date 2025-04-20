public class ArrayRead {
    public static void main(String[] args) {
        double[] temperatures = {36.5, 37.2, 38.1, 35.9, 37.8};
        
        // Read all elements
        System.out.println("All temperatures:");
        for (double temp : temperatures) {
            System.out.print(temp + "°C ");
        }
        
        // Read specific element
        System.out.println("\n\nThird day temperature: " + temperatures[2] + "°C");
        
        // Read with index condition
        System.out.println("\nTemperatures above 37°C:");
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > 37) {
                System.out.println("Day " + (i+1) + ": " + temperatures[i] + "°C");
            }
        }
    }
}